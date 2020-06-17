package URLconnectionTest;

import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteOrder;

public class URLconnection_test {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://java.sun.com");
        URLConnection urlCon = url.openConnection();
        urlCon.connect();

    }


}
