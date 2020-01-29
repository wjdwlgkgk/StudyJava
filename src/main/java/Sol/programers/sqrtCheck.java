package Sol.programers;

public class sqrtCheck {
    public static void main(String[] args) {

        long n = 123;
        long answer;
        int num = (int)Math.sqrt(n);

        for(int i = 1; i < 10000000; i++){
            if(i == num){
                num = i;
                break;
            }
        }

        if(Math.ceil(Math.sqrt(n)) != num)
            answer = -1;
        else
            answer = (num+1) * (num + 1);

        System.out.print(answer);



    }
}
