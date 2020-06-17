package Encription;

import Password.AES256Util;

public class aes256Test {
    public static void main(String[] args) throws Exception{
        String loginId = "lsware";
        AES256Util aes256 = new AES256Util();
        byte[] bLoginId = org.apache.commons.codec.binary.Base64.decodeBase64(loginId);
        String decryptLoginId = aes256.decrypt(bLoginId);

        System.out.println(decryptLoginId);
    }
}
