package pratice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputTextTest {
    public static void main(String agrs[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        String[] str = new String[100];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (str.length > count && scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split("\\s");
            if (scan.nextLine().equals("quit"))
//            if(str[count].equals("quit") )
            {
                for (int i = 0; i < count; i++) {
                    if (i < count - 1)
                        sb.append(str[i] + "\n");
                    else
                        sb.append(str[i]);
                }
                count = 0;
                break;
            } else {
                count++;
            }
        }

        System.out.print(sb.toString());
    }
}
