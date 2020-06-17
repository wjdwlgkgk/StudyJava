
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.ObjectUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;


import java.util.Base64.Encoder;


public class base64 {

    private static byte bKEY[] = {44, (byte) 211, 50, 102, (byte) 151, 25, (byte) 179, 87, 54, (byte) 228, 103, (byte) 240, (byte) 233, (byte) 178, 66, 109};
    private static byte bIV[] = {(byte) 231, 13, 89, 82, (byte) 218, (byte) 151, 58, (byte) 233, 87, 55, (byte) 242, (byte) 174, (byte) 228, 73, 120, (byte) 245};

    public static void main(String args[]) throws Exception {


        //csp 비번 변경.
//        String sePasswd = char2Security("under5001");
//        String sePasswd = "6ZOtAyYqRfbTK2ZxxJFQ";
//        System.out.println(sePasswd);

//    String base64msg = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiID8+CjxEdW1wIHR5cGU9InRh" +
//            "YmxlIj4KICAgIDxDb2x1bW5zIGNvdW50PSI0Ij4KICAgICAgICA8Q29sdW1uPlVJRDwvQ29s" +
//            "dW1uPgogICAgICAgIDxDb2x1bW4+UElEPC9Db2x1bW4+CiAgICAgICAgPENvbHVtbj5QUElE" +
//            "PC9Db2x1bW4+CiAgICAgICAgPENvbHVtbj5QU05BTUU8L0NvbHVtbj4KICAgIDwvQ29sdW1u" +
//            "cz4KICAgIDxSb3dzIGNvdW50PSIwIiAvPgo8L0R1bXA+Cg==";
//    String anw = base64Decode(base64msg);
//        System.out.println( "decrpyt : " + anw);
//        String msg = base64Encode(base64msg);
//        System.out.println( "encrypt : " + msg);

        //encrypt
//        String EncryptStr = "c:\\network";
//        try {
//            EncryptStr = doEncrypt(EncryptStr);
//            System.out.println(EncryptStr);
//        }catch (Exception e) { e.printStackTrace();}

        //decode
        String DecryptStr = "ErE7I6zaZIze4w4LJEcldg==";
        System.out.println(DecryptStr.length());
        try {
            DecryptStr = doDecryptString(DecryptStr);
            System.out.println(DecryptStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String doDecryptString(String encryptString) {
        if (!ObjectUtils.equals(encryptString, ObjectUtils.NULL)) {
            try {
                return doDecrypt(encryptString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return encryptString;
    }


    public static String doEncrypt(String plainText) throws Exception {
        return encrypt(plainText, bKEY, bIV);
    }

    public static String doDecrypt(String plainText) throws Exception {
        return decrypt(plainText, bKEY, bIV);
    }

    private static String decrypt(String cipherText, byte[] encryptionKey, byte[] iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey,
                "AES");
        cipher.init(Cipher.DECRYPT_MODE, key,
                new IvParameterSpec(iv));
        return new String(cipher.doFinal(Base64.decodeBase64(cipherText)));
    }


    private static String encrypt(String plainText, byte[] encryptionKey, byte[] iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey,
                "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key,
                new IvParameterSpec(iv));
        return Base64.encodeBase64String(cipher.doFinal(plainText.getBytes()));
    }

    public static String char2Security(String passwd) {
        return DigestUtils.sha512Hex(passwd);
    }

    public static String base64Decode(String str) throws IOException {
        if (str != null && !str.equals("")) {
            str = str.replace("\n", "");
            // @@see RFC4648 76 char add CRLF
            str = new String(java.util.Base64.getDecoder().decode(str), "UTF-8");
        }
        return str;
    }

    public static String base64Encode(String str) throws IOException {
        if (str != null && !str.equals("")) {
            str = str.replace("\n", "");
            // @@see RFC4648 76 char add CRLF
            str = new String(java.util.Base64.getEncoder().encode(str.getBytes("UTF-8")));
        }
        return str;
    }


}
