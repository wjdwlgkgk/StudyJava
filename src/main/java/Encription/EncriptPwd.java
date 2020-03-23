package Encription;


import com.sun.jna.Memory;
import com.sun.jna.Platform;
import com.sun.jna.win32.StdCallLibrary;

import java.lang.annotation.Native;
import java.nio.charset.Charset;

/**
 * @FileName : encriptPwd.java
 * @Project : UniTy4Win
 * @Date : 2013. 7. 23
 * @작성자 : JINLING
 * @변경이력 :
 * @프로그램설명:
 */
public class EncriptPwd {

    private String message = "";

    /**
     * @return the message
     */
    public String getMessage() {
    	return message;
    }

    public interface LSWEnc64 extends StdCallLibrary {
//        LSWEnc64 instance = (LSWEnc64) Native.loadLibrary((Platform.is64Bit() ? "LSWEnc64" : "LSWEnc32"), LSWEnc64.class);
//    	LSWEnc64 instance = (LSWEnc64) Native.loadLibrary("E:\\workspace_NEW\\workspace_cc\\unity_new_rere\\lswenc64.dll", LSWEnc64.class);

    	public int Encryption(Memory a, int b, Memory c, int d, Memory f, int g);
    }

    /**
     * @FileName : EncriptPwd.java
     * @Project : UniTy4Win
     * @Date : 2013. 8. 21.
     * @작성자 : JINLING
     * @변경이력 :
     * @프로그램설명: 암호화 메소드
     */
    public String encodedPwd(String input) {
//		LSWEnc64 encode = LSWEnc64.instance;
		int encrypt_buffer_len = 1024;
		int is_use_base64 = 1;
		Memory org_data_buff = new Memory(input.length() + 2); // kelon null_terminalted(\0) 추가 때문에 +2가된다. 원래는 +1이다.
		Memory encrypt_buffer = new Memory(1024);
		Memory encrypt_out_len = new Memory(4);
		String output = "";
		boolean encriptModule = true;

		// Character nullCharacter = '\u0000';
		Charset charSet = Charset.forName("UTF-8");

        byte [] bytes = (input + '\0').getBytes(charSet); // embedded nulls: [104, 101, 0, 108, 111, 0]
        input = new String(bytes , 0, bytes.length, charSet);

		org_data_buff.setString(0, input);

//		try {
//			    int ret = encode.Encryption(org_data_buff, input.length(), encrypt_buffer, encrypt_buffer_len, encrypt_out_len, is_use_base64);
//			    if (ret == 0) {
//				    output = encrypt_buffer.getString(0);
//			    } else {
//				encriptModule = false;
//			}
//		} finally {
//		    getException(encriptModule);
//		}
		return output;
    }

    /**
     * @MethodName : getException
     * @작성일 : 2013. 8. 21.
     * @작성자 : JINLING
     * @변경이력 :
     * @Method설명 : 암호화 된 값 반환
     * @param encriptModule
     * @return : message
     */
    public String getException(boolean encriptModule) {
	if (encriptModule) {
	    this.message = "success";
	} else {
	    this.message = "MSG-ALERT-ENCRIPT_MODULE_ERROR";
	}
	return message;
    }
}
