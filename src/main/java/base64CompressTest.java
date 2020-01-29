import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.*;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

public class base64CompressTest {

    public static void main(String[] args) throws Exception {

        File info_file = new File("C:\\Users\\admin\\Desktop\\EC2AMAZ-LEEUUNV_15_20191209203421_OS_windows_2016.xml");
        org.w3c.dom.Document doc = parseXML(info_file);
        doc.getDocumentElement().normalize();

        byte[] compressed = Base64.decodeBase64(doc.getElementsByTagName("oval_result").item(0).getTextContent().getBytes());
        String unzipStr = unzip(compressed);
        definitiEntry(unzipStr);



    }


    private static Document parseXML(File file){
        DocumentBuilderFactory factory = null;
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();

            doc = builder.parse(file);

        }catch(Exception e){
            e.printStackTrace();
        }
        return doc;
    }

    public static String unzip(final byte[] compressed) throws IllegalArgumentException{
        if ((compressed == null) || (compressed.length == 0)) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        if (!isZipped(compressed)) {
            return new String(compressed);
        }

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed)) {
            try (GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream)) {
                try (InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream, StandardCharsets.UTF_8)) {
                    try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                        StringBuilder output = new StringBuilder();
                        String line;
                        while((line = bufferedReader.readLine()) != null){
                            output.append(line);
                        }
                        return output.toString();
                    }
                }
            }
        } catch(IOException e) {
            throw new RuntimeException("Failed to unzip content", e);
        }
    }


    public static boolean isZipped(final byte[] compressed) {
        return (compressed[0] == (byte) (GZIPInputStream.GZIP_MAGIC)) && (compressed[1] == (byte) (GZIPInputStream.GZIP_MAGIC >> 8));
    }


    public static void definitiEntry(String data) throws XMLStreamException {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        try(InputStream in = new ByteArrayInputStream(data.getBytes())) {
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            XMLEventWriter xw = null;
            StringWriter sw = null;
            XMLOutputFactory of = XMLOutputFactory.newInstance();

            boolean results = false;
            boolean system = false;
            boolean definitions = false;

//            File writeFile = new File("C:\\Users\\admin\\Desktop\\vm1552368561994.localdomain_15_20191205175724_OS_linux_CentOS7.0.xml.txt");
//            OutputStream output = new FileOutputStream(writeFile);
            while (eventReader.hasNext()) {
                XMLEvent e = eventReader.nextEvent();

                String eParse = e.toString();
                if(eParse.contains("’")){

                }

//                byte[] bytes = String.valueOf(e).getBytes();
//                output.write(bytes);

                if(String.valueOf(e).contains("CVE-2017-5378")){
                    System.out.println(String.valueOf(e));
                }
                if (isStartEle("results", e)) {
                    results = true;
                } else if (isStartEle("system", e)) {
                    system = true;
                } else if (isStartEle("definitions", e)) {
                    definitions = true;
                } else if (results == true && system == true && definitions == true && isStartEle("definition", e)) {
                    StartElement ee = (StartElement) e;

                    String definition_id = getAttr(ee, "definition_id");
                    String version = getAttr(ee, "version");
                    String result = getAttr(ee, "result");

                    HashMap map = new HashMap();
//                    map.put("work_seq", work_seq);
//                    map.put("asset_seq", asset_seq);

                    map.put("oval_id", definition_id);
                    map.put("oval_id_version", version);
                    map.put("rslt_type", result);
//                    map.put("eval_asset_seq", eval_asset_seq);

//                    String ref_id = insertResultRepository.getCveId(map);

//                    if (ref_id != "" && ref_id != null) {
//                        map.put("cve_id", ref_id);
//                        insertResultRepository.insertEvalOval(map);
//                    }

                } else if (isEndEle("definitions", e)) {
                    definitions = false;
                } else if (isEndEle("system", e)) {
                    system = false;
                } else if (isEndEle("results", e)) {
                    results = false;
                } else if (xw != null) {
                    xw.add(e);
                }
            }
            HashMap hmap = new HashMap();
//            hmap.put("work_seq", work_seq);
//            hmap.put("asset_seq", asset_seq);
//            insertResultRepository.updateChkGrpOvalRslt(hmap);
//            output.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static boolean isEndEle(String results, XMLEvent e) {
        return e.isEndElement()
                && ((EndElement) e).getName().getLocalPart().equals(results);
    }

    private static boolean isStartEle(String results, XMLEvent e) {
        return e.isStartElement()
                && ((StartElement) e).getName().getLocalPart().equals(results);
    }

    private static String getAttr(StartElement e, String nm) {
        return e.getAttributeByName(QName.valueOf(nm)).getValue();
    }

}
