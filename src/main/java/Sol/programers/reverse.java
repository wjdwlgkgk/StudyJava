package Sol.programers;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        long n = 12345;
        ArrayList<Integer> ans = new ArrayList<>();
        while(n > 0){
            ans.add((int)(n%10));
            n/=10;
        }

        int[] answer = new int[ans.size()];
        int count = 0;
        for(int a : ans){
            answer[count] = a;
        }

        for(int a : answer)
            System.out.println(a);
    }
}
