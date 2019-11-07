package connect;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 9999);
            System.out.println("Connected.....");

            Scanner sc = new Scanner(System.in);

            while(true){
                String myMsg = sc.nextLine();

                OutputStream os = s.getOutputStream();
                DataOutputStream dos= new DataOutputStream(os);

                dos.writeUTF(myMsg);

                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String rcvMsg = dis.readUTF();

                System.out.println("ECHO : " + rcvMsg);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
