package Sol.programers;

import java.util.Scanner;

public class programers {

    public static void main(String[] args) throws Exception{
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.solution(n));

    }


}


class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i<= n; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                }
            }
            if(flag == true){
                answer++;
            }
        }
        return answer;
    }
}