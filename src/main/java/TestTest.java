import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) throws  Exception{
//        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write("그아아아아아아아~~~");

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for(int i = 2; i<n; i++){
//            if(n %i == 0)
//                System.out.println(i + "는 " + n + " 의 약수");
//
//
//        }

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] token = str.split(" ");
        StringBuilder answer = new StringBuilder();
        for(int i = 0 ; i < token.length; i++) {
            StringBuilder sb = new StringBuilder(token[i]);
            for (int j = 0; j < token[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.setCharAt(j, (char)(sb.charAt(j) - 32));
                }
            }

            if(i == token.length-1)
                answer.append(sb);
            else
                answer.append(sb + " ");

        }
        System.out.println(answer.toString());
    }
}
