package ThreadTest;


class VITAMIN extends Thread{
    String name;

    @Override
    public void run() {
        System.out.println("VITAMIN");
    }
}

class VITAMIN2 extends VITAMIN{

    @Override
    public void run() {
        System.out.println("VITAMIN2");
    }
}



public class ThreadIntoTest {
    public static void main(String[] args) {

        VITAMIN2 v2 = new VITAMIN2();


        v2.start();


    }
}
