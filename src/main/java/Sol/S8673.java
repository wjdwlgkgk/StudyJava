package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S8673 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for (int Test = 1; Test <= T; Test++) {

            int twoUp = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(str, " ");
            int LengthForArray = (int) Math.pow(2, twoUp);
            int[] IArray = new int[LengthForArray];
            int i = 0;
            while(tokenizer.countTokens() != 0) {
                IArray[i] = Integer.parseInt(tokenizer.nextToken());
                i++;
            }
            sb.append("#" + Test + " " + Sol(IArray, LengthForArray, 0) + "\n");
        }
        System.out.print(sb);
    }

    public static int Sol(int[] IArray ,int LengthForArray , int count) {

        if(LengthForArray > 1){
            int[] SmallIArray = new int[LengthForArray / 2];
            for (int i = 0; i < IArray.length; i += 2) {
                SmallIArray[i / 2] = Math.max(IArray[i], IArray[i + 1]);
                count = count + Math.abs(IArray[i] - IArray[i + 1]);
            }
            LengthForArray/=2;
            return Sol(SmallIArray, LengthForArray, count);
        }
        else
            return count;
    }
}
