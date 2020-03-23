package connect;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer1 {

    public static void main(String[] args) {
        ServerSocket a;
        try {
            a = new ServerSocket(9999);
            System.out.println("Multi-Server Start !!!...");

            Socket b = a.accept();
            while (true) {
                InputStream is = b.getInputStream();
                DataInputStream ds = new DataInputStream(is);

                String rcvBuff = ds.readUTF();
                System.out.println("읽은 내용 : " + rcvBuff);

                OutputStream os = b.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);

                dos.writeUTF(rcvBuff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
