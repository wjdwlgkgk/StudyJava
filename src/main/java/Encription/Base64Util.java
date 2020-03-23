package Encription;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
*
* Filename  : Base64Util.java
* Class     : Base64Util
* Function  : Base64 Encoding/Decoding 을 수행하는 클래스
* Comment   :
* History	: 2000-08-16 2:48오후

* @version  1.0
* @author carouser
*/

public class Base64Util {

    public Base64Util() {}

    /**
     * Base64Encoding을 수행한다. binany in ascii out
     *
     * @param encodeBytes encoding 할 byte array
     * @return encoding 된 String
     */
    public static String base64Encode(byte[] encodeBytes) {
        //ByteArrayInputStream bin = new ByteArrayInputStream(encodeBytes);
        //ByteArrayOutputStream bout = new ByteArrayOutputStream();
        byte[] buf = null;


        try{
            //base64Encoder.encodeBuffer(bin, bout);
        	buf = Base64.encodeBase64(encodeBytes);
        } catch(Exception e) {
            e.printStackTrace();
        }
        //buf = bout.toByteArray();
        return new String(buf).trim();
    }

    /**
     * Base64Encoding을 수행한다. String in ascii out
     *
     * @return encoding 된 String
     */
    public static String base64Encode(String strEncode) {
        String result = "";
        if (strEncode != null && !"".equals(strEncode)) {
            result = base64Encode(strEncode.getBytes());
        }
        return result;
    }

	/**
	 * Base64Decoding 수행한다. String out ascii in
	 *
	 * @param strDecode decoding 할 String
	 * @return decoding 된  String
	 */
	public static String base64Decode(String strDecode) {
		String result = "";
		try {
			if (strDecode != null && !"".equals(strDecode)) {
				if(strDecode.contains("edata=") || strDecode.contains("EDATA=")) {
					strDecode = strDecode.replaceAll("edata=", "");
					strDecode = strDecode.replaceAll("EDATA=", "");
				}
				byte[] b1 = Base64.decodeBase64(strDecode.getBytes());
				//byte[] b1 = decoder.decodeBuffer(strDecode);
				result = new String(b1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}


		return result;
	}

//	@Test
//	public void 복호화() {
//		String str = "REFUQT0xOTIuMTY4LjEyMy41Nnx8QWRtaW5pc3RyYXRvcnx8UEBzc3cwcmQxMnx8MjAyMDAzMDgy MDUwMTcmVkVSU0lPTj0xLjAA";
//		str = base64Decode(str);
//		System.out.println("ddd:=>"+ str);
//	}

	/**
	 * byte[] ret = digest("MD5", "abcd".getBytes()); 처럼 호출
	 *
	 */
	public static byte[] messageDigest(String alg, byte[] input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(alg);
		return md.digest(input);
	}
}