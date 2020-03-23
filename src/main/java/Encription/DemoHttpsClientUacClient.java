package Encription;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DemoHttpsClientUacClient {
    public static void main(String[] args) throws IOException, InterruptedException,
            KeyManagementException, NoSuchAlgorithmException {
		String url = "http://192.168.122.66:8080/userAuth/userAuth.do";

		String key = "EDATA";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		String today = sdf.format(cal.getTime());

		String value = Base64.encodeBase64String(new String("DATA=192.168.123.171||administrator||lsware||"+ today +"&VERSION=1.0").getBytes());

		send(url, key, value);
	}

	private static void send(String url, String key, String value) throws NoSuchAlgorithmException, KeyManagementException {
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addTextBody(key, value);
		HttpEntity entity = builder.build();

		HttpPost request = new HttpPost(url);
		request.setEntity(entity);
		SSLContext ctx = SSLContext.getInstance("TLS");
		ctx.init(new KeyManager[0], new TrustManager[]{new DefaultTrustManager()}, new SecureRandom());
		SSLContext.setDefault(ctx);
		CloseableHttpClient client = HttpClients
				.custom()
				.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
				.setSSLContext(ctx)
				.build();
		System.out.println("===============Response Data Start==========");
		try {
			CloseableHttpResponse res = client.execute(request);
			org.apache.http.Header[] header = res.getAllHeaders();
			for (org.apache.http.Header h : header) {
				System.out.println(h.getName() + " : " + h.getValue());
			}
			String body = EntityUtils.toString(res.getEntity());
			System.out.println(body);


		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===============Response Data End==========");

	}

	private static class DefaultTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
        }
        @Override
        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
        }
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }
}
