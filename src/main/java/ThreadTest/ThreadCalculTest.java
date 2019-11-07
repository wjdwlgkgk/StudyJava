package ThreadTest;

class CalcThread extends Thread{
    private int num1, num2, result;
    CalcThread(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        result = 0;
    }

    @Override
    public void run(){
        result = num1 + num2;
    }

    public int getResult(){
        return result;
    }
}




public class ThreadCalculTest {
    public static void main(String args[]){
        CalcThread calcThread = new CalcThread(5, 7);
        calcThread.start();
        try {
            calcThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(calcThread.getResult());
    }
}
