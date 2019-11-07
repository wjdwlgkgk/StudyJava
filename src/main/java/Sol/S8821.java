package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S8821 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for(int Test = 1 ; Test <= T; Test++){
           String str = br.readLine();
           int[] Su = new int[10];
           int count = 0;

           for(int i = 0 ; i < str.length(); i++){
                    Su[str.charAt(i) - '0']++;
           }
           for(int i = 0 ; i < Su.length; i++){
               if(Su[i] % 2 != 0) count++;
           }
           sb.append("#"+Test+" " + count+"\n");
        }
        System.out.print(sb);


    }
}
