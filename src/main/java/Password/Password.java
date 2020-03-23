package Password;

public class Password {

    public static void main(String[] args) {

        String pass = Sha1SaltUtil.getEncrypt("12345");
        System.out.println(pass.length());
        System.out.println("t1hboeRyKonZJ8+ObPr3feDbiKI=".length());

//        AES256Util aes256 = new AES256Util();
//        byte[] bLoginId = org.apache.commons.codec.binary.Base64.decodeBase64(loginId);
//        String decryptLoginId = aes256.decrypt(bLoginId);

    }
}
