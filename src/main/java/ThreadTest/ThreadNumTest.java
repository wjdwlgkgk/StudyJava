package ThreadTest;

class Num {
    private int num;

    Num(int num) {
        this.num = num;
    }

    public void increadNum() {
        num++;
    }

    public int getNum() {
        return num;
    }
}

class Adder extends Thread {
    private Num num;
    private int loop;
    private String name;

    Adder(Num num, int loop, String name) {
        this.num = num;
        this.loop = loop;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < loop; i++) {
            num.increadNum();
        }
    }

    public void getResult() {
        System.out.println(name + " : " + num.getNum());
    }
}


public class ThreadNumTest {
    public static void main(String args[]) {
        Num num = new Num(5);
        Adder adder1 = new Adder(num, 1000, "adder1");
        Adder adder2 = new Adder(num, 1000, "adder2");

        adder1.start();
        adder2.start();

        try {
            adder1.join();
            adder2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            adder1.getResult();
            adder2.getResult();
        }
    }
}
