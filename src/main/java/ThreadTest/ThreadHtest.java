package ThreadTest;

class Human {
    private String name;
    private int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

class Student extends Human implements Runnable{

    private String subject;
    Student(String name, int age, String subject){
        super(name,age);
        this.subject = subject;
    }


    @Override
    public void run(){
        for(int i = 0 ; i < 5; i++){
            System.out.println("제 이름은 " + getName() + "입니다.");
            System.out.println("제 나이는 " + getAge() + "입니다.");
            System.out.println("제 전공은 " + subject + "입니다.");
            System.out.println();
        }
        try{
            Thread.sleep(150);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}




public class ThreadHtest {

    public static void main(String args[]){
        Student jiha = new Student("지하", 27, "컴퓨터");
        Student jaeho = new Student("재호", 28, "몸일");

        Thread jiha_Thread = new Thread(jiha);
        Thread jaeho_Thread = new Thread(jaeho);

        jiha_Thread.start();
        jaeho_Thread.start();
    }
}
