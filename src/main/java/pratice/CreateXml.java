package pratice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXml {

    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = docBuilderFactory.newDocumentBuilder();
        Document doc = parser.newDocument();

        Element body, options, option, propnm, metatype, propvalue;
        body = doc.createElement("body");
        options = doc.createElement("options");
        option = doc.createElement("option");
        doc.appendChild(body);
        body.appendChild(options);
        options.appendChild(option);
        propnm = doc.createElement("propnm");
        metatype = doc.createElement("metatype");
        propvalue = doc.createElement("propvalue");
        propnm.setTextContent("text");
        metatype.setTextContent("text");
        propvalue.setTextContent("text");
        option.appendChild(propnm);
        option.appendChild(metatype);
        option.appendChild(propvalue);


        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer former = factory.newTransformer();
        former.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        former.setOutputProperty(OutputKeys.INDENT, "yes");

        StringWriter sw = new StringWriter();
        StreamResult result = new StreamResult(sw);
        DOMSource source = new DOMSource(doc);
        former.transform(source, result);
        System.out.println(sw.toString());
    }

}