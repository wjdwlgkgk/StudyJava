package SocketServer;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer_test {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            InetAddress userInfo = s.getInetAddress();
            String ip = userInfo.getHostAddress();

            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

            String message = br.readLine();

            bw.write("[" + ip +"]님 환영합니다. \n");

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
