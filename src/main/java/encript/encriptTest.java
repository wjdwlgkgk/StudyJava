package encript;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class encriptTest {
    public static void main(String[] args) throws Exception{
        SecurityString securityString = new SecurityString();
        String passwd = "secums";
        String rootPasswd = "secumsadmin";
        passwd = securityString.doEncrypt(passwd);
        rootPasswd = securityString.doEncrypt(rootPasswd);
        System.out.println("passwd : " +passwd);
        System.out.println("rootPasswd : " +rootPasswd);

        String url = "cmGrVQGBSGYMa5BWguwypLwmzmMJXPpn3R79Yekk0IJx7CyI/HW2oYkq+Oz2kb9DMVtQnTwRFksn/pa3I5iKiA==";
        String id = "yjxg1ZKDjusN1zB7wbc1tQ==";
        String pw = "TzJUUJ4QDLU29rCEemWeUA==";
        url = securityString.doDecrypt(url);
        id = securityString.doDecrypt(id);
        pw = securityString.doDecrypt(pw);
        System.out.println("url : " + url);
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);

    }
}


class SecurityString {


    public String doEncrypt(String plainText ) throws Exception{
        return encrypt(plainText,bKEY,bIV);
    }
    public String doDecrypt(String plainText)throws Exception{
        return decrypt(plainText,bKEY,bIV);
    }


    private String encrypt(String plainText, byte[] encryptionKey, byte[] iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey,
                "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key,
                new IvParameterSpec(iv));
        return Base64.encodeBase64String(cipher.doFinal(plainText.getBytes()));
    }

    private String decrypt(String cipherText, byte[] encryptionKey, byte[] iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey,
                "AES");
        cipher.init(Cipher.DECRYPT_MODE, key,
                new IvParameterSpec(iv));
        return new String(cipher.doFinal(Base64.decodeBase64(cipherText)));
    }

    private byte bKEY[] = {44, (byte) 211, 50, 102, (byte) 151, 25, (byte) 179, 87, 54, (byte) 228, 103, (byte) 240, (byte) 233, (byte) 178, 66, 109};
    private byte bIV[] = {(byte) 231, 13, 89, 82, (byte) 218, (byte) 151, 58, (byte) 233, 87, 55, (byte) 242, (byte) 174, (byte) 228, 73, 120, (byte) 245};


}