package ThreadTest;

class Info {
    String name;
    int value;

    @Override
    public String toString() {
        return (name + "(" + value + ")");
    }
}


class Goods {
    Info info;
    private boolean isUploaded;

    Goods() {
        info = new Info();
    }

    public void setInfo(String name, int value) {
        info.name = name;
        info.value = value;
        isUploaded = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public Info getInfo() {
        if (isUploaded == false) {
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return info;
    }
}


class HomepageManager extends Thread {
    private Goods goods;
    private String name;
    private int value;

    HomepageManager(Goods goods, String name, int value) {
        this.goods = goods;
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() {
        goods.setInfo(name, value);
    }

}

class CustomerViewer extends Thread {
    private Goods goods;
    private String id;

    CustomerViewer(Goods goods, String id) {
        this.goods = goods;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id + " 가 보고있는 쇼핑몰 물품 내용 : " + goods.getInfo());
    }
}

public class ThreadSyncTest {
    public static void main(String args[]) {
        Goods goods = new Goods();
        HomepageManager homepageManager = new HomepageManager(goods, "태블릿", 100000);
        CustomerViewer customerViewer1 = new CustomerViewer(goods, "채숨실");
        CustomerViewer customerViewer2 = new CustomerViewer(goods, "이세상바꾼애");


        customerViewer1.start();
        customerViewer2.start();
        homepageManager.start();

        try {
            customerViewer1.join();
            customerViewer2.join();
            homepageManager.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
