package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S8658 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for(int Test = 1; Test <= T; Test++){
            String str = br.readLine();
            String[] split= str.split(" ");
            int[] IntegerArray = new int[split.length];
            for(int i = 0 ; i < split.length; i++){
                IntegerArray[i] = Summation(Integer.parseInt(split[i]));
            }
            Arrays.sort(IntegerArray);
            sb.append("#" + Test + " " + IntegerArray[IntegerArray.length-1] + " " + IntegerArray[0] + "\n");
        }
        System.out.print(sb);
    }

    public static int Summation(int su){
        int R, sum = 0;
        while(su != 0){
            R = su%10;
            sum+=R;
            su/=10;
        }
        return sum;
    }
}
