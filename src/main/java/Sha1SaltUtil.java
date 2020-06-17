import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Sha1SaltUtil {
    public static String getEncrypt(String input) {

        String output = "";
        try {
            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
            byte[] result = mDigest.digest(input.getBytes());

            Encoder encoder = Base64.getEncoder();
            output = encoder.encodeToString(result);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public static String getDecrypt(String input) {

        byte[] output;
        String ret = "";
        try {
//            MessageDigest mDigest = MessageDigest.getInstance("SHA1");
//            byte[] result = mDigest.digest(input.getBytes());

            Decoder decoder = Base64.getDecoder();
            output = decoder.decode(input);


            ret = new String(output);


        }catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }


    public static void main(String[] args) {
        String encrypt = getEncrypt("!itwlseks001");
        System.out.println(encrypt);
        String decrypt = getDecrypt(encrypt);
        System.out.println(decrypt);
    }
}
