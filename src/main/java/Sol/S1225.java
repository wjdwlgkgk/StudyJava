package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S1225 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int Test = 0; Test < 10; Test++) {
            int T = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            ArrayList<Integer> IArr = new ArrayList<>(st.countTokens());

            while (st.hasMoreElements())
                IArr.add(Integer.parseInt(st.nextToken()));

            boolean flag = true;
            while (flag) {
                for (int i = 1; i <= 5; i++) {
                    int chg = IArr.remove(0);
                    if (chg - i > 0)
                        chg -= i;
                    else {
                        chg = 0;
                        IArr.add(chg);
                        flag = false;
                        break;
                    }
                    IArr.add(chg);
                }
            }

            sb.append("#" + T);
            for (int i = 0; i < IArr.size(); i++) {
                sb.append(" " + IArr.get(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
