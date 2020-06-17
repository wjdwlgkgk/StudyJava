package encript;

import java.security.MessageDigest;

public class MessageDiget_Test {
    public static void main(String[] args) throws Exception {

        String str = "hihi";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte byteData[] = md.digest();

        StringBuffer sb = new StringBuffer();

        for(byte byteTemp : byteData) {
//            sb.append(Integer.toString(byteTemp&0xff) + 0x100, 16).substring(1)
        }
    }
}
