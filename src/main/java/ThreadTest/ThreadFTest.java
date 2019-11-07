package ThreadTest;

class Fruit extends Thread{
    private String name;
    Fruit(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 5; i++){
            System.out.println("저는" + name + "Thread 입니다. ");
            try{
                sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Fruit2 implements Runnable{
    private String name;
    Fruit2(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 5; i++){
            System.out.println("저는" + name + "Thread 입니다. ");
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class ThreadFTest {

    public static void main(String args[]){
    Fruit f1 = new Fruit("apple");
    Fruit f2 = new Fruit("banana");

    Fruit2 f21 = new Fruit2("apple");
    Fruit2 f22 = new Fruit2("banana");

    Thread t21 = new Thread(f21);
    Thread t22 = new Thread(f22);


//    f1.start();
//    f2.start();

    t21.start();
    t22.start();


    }
}
