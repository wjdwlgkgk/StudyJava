package Sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S7810 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int Test = 1; Test<=T; Test++){
            int count = 0;
            int su = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a[] = new int[su];
            while(st.hasMoreElements()){
                a[count] = Integer.parseInt(st.nextToken());
                count++;
            }
            Arrays.sort(a);


            int anw = 0;
//            for(int i = 0; i<= a[a.length-1]; i++){
//                int innerCount = 0;
//                for(int j = 0 ; j < a.length; j++) {
//                    if(i <= a[j]){
//                        innerCount++;
//                    }
//                }
//                if(innerCount >= i)
//                    anw = i;
//            }

            for(int i = 1; i<= su; i++){
                if(a[su - i] >= i){
                    anw = i;
                }
            }


            bw.write("#" + Test + " " + anw + "\n");

        }
        bw.close();

    }

}
