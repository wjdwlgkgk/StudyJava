package Password;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;


public class AES256Util {

    private static final int keyLength = 16;
    private static SecretKey key;
    private static String scKey = "!dpfdptmdnpdj123";
    private static byte[] iv = "0123456789abcdef".getBytes(); /* 16 bytes */

    public AES256Util() throws Exception {
    	key = generateKey();
    	Security.addProvider(new BouncyCastleProvider());
	}
    
    public static byte [] encrypt(String plaintext) throws Exception {
        //key = generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));

        return cipher.doFinal(plaintext.getBytes());
    }

    public static String decrypt(byte [] ciphertext) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
        return new String(cipher.doFinal(ciphertext));
    }

    private static SecretKey generateKey() throws Exception {
    	byte[] keyBytes = new byte[keyLength];
    	keyBytes = scKey.getBytes();
    	SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        return keySpec;
    }
}