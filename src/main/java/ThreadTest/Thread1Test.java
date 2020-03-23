package ThreadTest;

public class Thread1Test extends Thread {

    public void run() {
        System.out.println(Thread.currentThread() + " = Thread.currentThread() ");
        System.out.println("test1 run!");
    }
}
