package Sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S7829 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int Test = 1; Test <= T; Test++) {
            int anw = 0;
            int su = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a[] = new int[su];
            while (st.hasMoreElements()) {
                a[anw] = Integer.parseInt(st.nextToken());
                anw++;
            }
            Arrays.sort(a);


            if (a.length != 1)
                anw = a[0] * a[a.length - 1];
            else if (a.length == 1)
                anw = a[0] * a[0];

            bw.write("#" + Test + " " + anw + "\n");

        }
        bw.close();

    }
}
