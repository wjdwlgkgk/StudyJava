/*
 * Copyright (c) 2014 lsware.co.kr CO.,LTD. All rights reserved.
 *
 * This software is the confidential and proprietary information of lsware.co.kr CO.,LTD.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered into
 * with lsware.co.kr CO.,LTD.
 */

package Encription;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.win32.StdCallLibrary;

/**
 * @author Jenna
 * @date 2014. 9. 18.
 * @brief
 */
public class CryptoLib {

	/**
	 *
	 */
	public CryptoLib() {
		// TODO Auto-generated constructor stub
	}

	private String message = "";

	public interface LSWEnc64 extends StdCallLibrary {
    	LSWEnc64 instance = (LSWEnc64) Native.loadLibrary((Platform.is64Bit() ? "LSWEnc64" : "LSWEnc32"), LSWEnc64.class);


    	public int Encryption(Memory a, int b, Memory c, int d, Memory f, int g);
    	public int Decryption(Memory a, int b, Memory c, int d, Memory f, int g);
    }

    public String decryptionPostData(String input) {
		LSWEnc64 encode = LSWEnc64.instance;
		int normal_buffer_len = 260*100;
		int is_use_base64 = 1;
		Memory en_data_buff = new Memory(input.length() + 1);
		Memory normal_buffer = new Memory(normal_buffer_len);
		Memory normal_out_len = new Memory(4);
		String output = "";
		boolean decryptModule = true;

		en_data_buff.setString(0, input);

		try {
			    int ret = encode.Decryption(en_data_buff, input.length(), normal_buffer, normal_buffer_len, normal_out_len, is_use_base64);
			    if (ret == 0) {
				    output = normal_buffer.getString(0);
			    } else {
			    	decryptModule = false;
			}
		} finally {
		    getException(decryptModule);
		}
		return output;
    }

    public String getException(boolean decryptModule) {
    	if (decryptModule) {
    	    this.message = "success";
    	} else {
    	    this.message = "MSG-ALERT-DECRIPT_MODULE_ERROR";
    	}
    	return message;
    }

}
