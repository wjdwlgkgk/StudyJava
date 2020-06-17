package Sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S8934 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int TC = Integer.parseInt(br.readLine());


        for(int T = 1 ; T <= TC; T++){
            String str = br.readLine();
            if(!palindrome(str)){
                sb.append( "#" + T + " YES\n");
            }
            else{
                sb.append( "#" + T + " NO\n");
            }
        }
        System.out.println(sb.toString());

    }

    public static boolean palindrome(String str){

        int len = str.length();
        len = len%2==0 ? len/2 : len/2+1;
        for(int i = 0 ; i< len; i++){
            if(str.charAt(i) ==str.charAt(str.length()-1-i)){

            }else {
                return true;
            }
        }
        return false;
    }



}
