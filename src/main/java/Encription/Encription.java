package Encription;

import com.sun.jna.Memory;

public class Encription {

    public static void main(String[] args) {



//        String str = decryptionPostData("6ZOtAyYqRfbTK2ZxxJFQ");
//        System.out.println(str);


    }



//
//    public static String decryptionPostData(String input) {
//        Encription.CryptoLib.LSWEnc64 encode = Encription.CryptoLib.LSWEnc64.instance;
//        int normal_buffer_len = 260*100;
//        int is_use_base64 = 1;
//        Memory en_data_buff = new Memory(input.length() + 1);
//        Memory normal_buffer = new Memory(normal_buffer_len);
//        Memory normal_out_len = new Memory(4);
//        String output = "";
//        boolean decryptModule = true;
//
//        en_data_buff.setString(0, input);
//
//        try {
//            int ret = encode.Decryption(en_data_buff, input.length(), normal_buffer, normal_buffer_len, normal_out_len, is_use_base64);
//            if (ret == 0) {
//                output = normal_buffer.getString(0);
//            } else {
//                decryptModule = false;
//            }
//        } finally {
////            getException(decryptModule);
//        }
//        return output;
//    }



}
