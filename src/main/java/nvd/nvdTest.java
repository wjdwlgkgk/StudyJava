package nvd;

import nvd.Crawl.Crawl;
import nvd.Vo.cve;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;

public class nvdTest {

    static String tmpdir = System.getProperty("java.io.tmpdir");
    static String nvdCve = "https://nvd.nist.gov/feeds/json/cve/1.1/nvdcve-1.1-2019.json.zip";

    public static void main(String[] args) throws Exception {
        Crawl cr = new Crawl();
        String dir = tmpdir;
        String fileName = "%s";

        String url = nvdCve;
        String downFileName = nvdCve;
        String xmlFileName = nvdCve;

        SEFile zipFile = new SEFile(dir, "downFileName", "zip");
        SEFile xmlFile = new SEFile(dir, "xmlFileName", "xml");
        try {
            cr.fileDown(url, zipFile);
            cr.unzip(zipFile, xmlFile);
            ////////////////////넣기.

            ObjectMapper mapper = new ObjectMapper();
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(xmlFile));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray CVEItems = (JSONArray) jsonObject.get("CVE_Items");

            ArrayList<cve> cves = new ArrayList<>();

            for (int i = 0; i < CVEItems.size(); i++) {
                JSONObject CVEdata = (JSONObject) CVEItems.get(i);
                String TempcveItem = mapper.writeValueAsString(CVEdata.get("cve"));
                cve cveItems = mapper.readValue(TempcveItem, cve.class);
                cves.add(cveItems);
                if (cveItems.getCVE_data_meta().get("ID").equals("CVE-2019-1660"))
                    System.out.println("gdgdgdg");

            }

            System.out.println("hiahiahiahiahi");
            System.out.println("hiahiahiahiahi");
            System.out.println("hiahiahiahiahi");
            System.out.println("hiahiahiahiahi");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
