package Password;

import java.security.MessageDigest;
import java.util.Base64;
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
}
