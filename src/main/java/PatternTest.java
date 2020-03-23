import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) throws Exception {


        StringBuffer buffer = new StringBuffer();
        FileInputStream fis = new FileInputStream("D:\\test.txt");

        InputStreamReader isr = new InputStreamReader(fis, "UTF8");

        Reader in = new BufferedReader(isr);
        int ch;
        while ((ch = in.read()) > -1) {
            buffer.append((char) ch);
        }
        in.close();
        isr.close();
        fis.close();

        String buPolicy = new String(buffer);
        String BuHmac = PatternTest.hmacAdd(buPolicy);

        System.out.println("asdfb");
    }


    public static String hmacAdd(String datas) throws Exception {
        String ALG = "HmacSHA256";

        Mac mac;
        String result = "";
        byte[] bytesKey = "!tlzb001secums#123choimh/u0984".getBytes("UTF-8");
        final SecretKeySpec secretKey = new SecretKeySpec(bytesKey, ALG);
        mac = Mac.getInstance(ALG);
        mac.init(secretKey);
        final byte[] macData = mac.doFinal(datas.getBytes("UTF-8"));
        String hexText2 = Hex.encodeHexString(macData);
        return hexText2;
    }


}
