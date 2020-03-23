package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S7584 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        for (int Test = 1; Test <= T; Test++) {
            Long k = Long.parseLong(br.readLine());

            while (k > 3) {
                Long get2 = 0L;
                get2 = sch2(k);
                k = k - get2;
            }

            sb.append("#" + Test);
            if (k == 3) sb.append(" 1\n");
            else if (k == 2 || k == 1) sb.append(" 0\n");
            else if (k == 0) sb.append(" 0\n");
        }
        System.out.print(sb);
    }

    public static Long sch2(Long th) {
        int count = 0;
        while (th >= pow2(count))
            count++;
        return pow2(count - 1);
    }

    public static Long pow2(int up) {
        Long sch2 = 1L;
        for (int i = 0; i < up; i++) {
            sch2 *= 2;
        }
        return sch2;
    }

}
