package connect;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPTEST {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(9999);
            InetAddress ia = InetAddress.getByName("localhost");

            while (true) {
                Scanner sc = new Scanner(System.in);
                if (sc.hasNext()) {
                    String sendMsg = sc.nextLine();
                    byte[] bf_send = sendMsg.getBytes();
                    DatagramPacket dp_send = new DatagramPacket(bf_send, bf_send.length);
                    ds.send(dp_send);
                }

                byte[] bf_recv = new byte[30];
                DatagramPacket dp_recv = new DatagramPacket(bf_recv, bf_recv.length);
                ds.receive(dp_recv);
                String rs1 = new String(dp_recv.getData());
                System.out.println("소스 주소 : " + dp_recv.getAddress() + " : " + dp_recv.getPort());
                System.out.println("수신 메시지 : " + rs1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
