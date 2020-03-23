package Study.Car_ex.util;

import java.util.Vector;

public class ExtendsForC {
    public static void main(String[] args) {
        //배열을 포함한 컬렉션을 쉽게 사용할 수 있도록 향상된 for문을 제공함.
        //collection -> 요소들을 순차적으로 꺼내기 위해서 Collection에 저장된 요소의 갯수를 확인하고, 그 길이만큼 반복함. Enumeration을 이용할 때가 있음.
        //확장된 for문 -> enumeration을 사용하지 않고도, Collection에서 요소들을 순차적으로 접근할 수 있음.

        //ex1
        int[] scoreList = {50, 45, 99, 85, 100};
        int scoreSum = 0;
        for (int score : scoreList) {
            scoreSum = scoreSum + score;
        }
        System.out.println("합 : " + scoreSum);

        //ex2
        Vector<String> subjectList = new Vector<String>();
        subjectList.add("Java");
        subjectList.add("SQL");
        subjectList.add("Servlet");

        //접근 변수의 내용을 Generics이용 하는것이 좋음.
        for (String subject : subjectList) {
            System.out.println(subject);
        }

    }
}
