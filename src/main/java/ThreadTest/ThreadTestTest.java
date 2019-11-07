package ThreadTest;

public class ThreadTestTest {
    public static void main(String args[]) throws Exception{
        Runnable1Test r1 = new Runnable1Test();
        Thread1Test t1 = new Thread1Test();
        Thread2Test t2 = new Thread2Test();
        Thread t3 = new Thread(r1);


        t3.start();
        t1.start();
        t2.start();

    }

}
