package ThreadTest;

class ThreadPriority extends Thread {
    private String name;

    ThreadPriority(String name, int priority) {
        this.name = name;
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " 쓰레드 우선순위 : " + getPriority());
        }
    }

}


public class ThreadPriorityTest {
    public static void main(String args[]) {
        //쓰레드 우선순위는 1~10까지 존재한다.
        ThreadPriority tp1 = new ThreadPriority("tp1", Thread.MAX_PRIORITY);
        ThreadPriority tp2 = new ThreadPriority("tp2", Thread.NORM_PRIORITY);
        ThreadPriority tp3 = new ThreadPriority("tp3", Thread.MIN_PRIORITY);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}
