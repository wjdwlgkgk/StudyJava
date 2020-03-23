package Study.Car_ex.Collection;

import java.util.LinkedList;

public class LinkedListC {
    // AbstractSequentialList 클래스 와 List 인터페이스의 모든 메서드를 사용.
    // 첫 요소나 마지막 요소에 삽입/ 삭제가 효율적으로 이루어지므로 이데 대한 추가적인 메서드를 제공함.
    // addFirst(Object obj), addLast(Object obj), getFirst(), getLast(), removeFirst(), removeLast()
    public static void main(String[] args) {
        LinkedList<Double> scoreList = new LinkedList<>();
        scoreList.add(9.5);
        //addFirst이기 때문에 9.5가 2번 인덱스로 밀림.
        scoreList.addFirst(8.4);

        scoreList.add(9.2);
        scoreList.add(9.5);
        scoreList.add(6.2);
        System.out.println(scoreList.toString());

        double minScore = scoreList.getFirst();
        double maxScore = scoreList.getLast();

        scoreList.removeFirst();
        scoreList.removeLast();
        System.out.println(scoreList.toString());

        double sum = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }

        System.out.println("최저 점수 : " + minScore);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("평균 점수 : " + (sum / scoreList.size()));


    }
}
