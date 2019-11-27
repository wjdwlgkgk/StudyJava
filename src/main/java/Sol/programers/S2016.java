package Sol.programers;

public class S2016 {

    public static void main(String[] args) {

        System.out.println(solution(1,7));
    }
    public static String solution(int a, int b) {
        int[] monthEnd = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int totalDay = 0;

        for(int i = 0 ; i < a-1; i++)
            totalDay += monthEnd[i];
        totalDay += b;

        totalDay = (totalDay % 7) == 0 ? 7 : totalDay % 7;
        String answer = day[totalDay -1];

        return answer;
    }
}
