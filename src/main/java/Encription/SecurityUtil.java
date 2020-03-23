package Encription;


public class SecurityUtil {

	/**
	 * 문자열의 MD5 해쉬 값을 추출하여 Base64Encode
	 * @param strEncode
	 * @return encoding 된 문자열
	 */
	public static String md5Encode(String strEncode){
		try{
			byte[] md5Hash = Base64Util.messageDigest("MD5", strEncode.getBytes());
			String retMd5 = Base64Util.base64Encode(md5Hash);
			return retMd5 ;
		}catch(Exception e){
			return new String("error");
        }
    }

	/**
	 * 문자열의 SHA1 해쉬 값을 추출하여 Base64Encode
	 * @param strEncode
	 * @return encoding 된 문자열
	 */
	public static String sha1Encode(String strEncode){
		try{
			byte[] shaHash = Base64Util.messageDigest("SHA1", strEncode.getBytes());
			String retSha1 = Base64Util.base64Encode(shaHash);
			return retSha1 ;
		}catch(Exception e){
			return new String("error");
		}
	}

	/**
	 * 문자열의 SHA-256 해쉬 값을 추출하여 Base64Encode
	 * @param strEncode
	 * @return encoding 된 문자열
	 */
	public static String sha2Encode(String strEncode){
		try{
			byte[] shaHash = Base64Util.messageDigest("SHA-256", strEncode.getBytes());
			String retSha2 = Base64Util.base64Encode(shaHash);
			return retSha2 ;
		}catch(Exception e){
			return new String("error");
		}
	}
}