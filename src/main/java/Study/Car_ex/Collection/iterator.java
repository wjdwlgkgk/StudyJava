package Study.Car_ex.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class iterator {
    public static void main(String[] args) {
        // 컬렌션 클래스의 모든 요소를 처음부터 끝까지 순차적으로 접근 가능하도록 해주는 인터페이스
        //ex) 회원목록을 List에 저장하고 저장한 모든 목록을 순서대로 출력함. 결제할 보고서를 저장한 후 출력함.
        // Iterator는 간단하고 통일된 방법으로 처리할 수 있는 방법을 제공함.
        //직접 객체를 생성할 수 없고, 컬렉션 클래스의 iterator() 메서드를 통하여 객체를 얻을 수 있다.
        //boolean hasNext() => iterator에 요소가 더 남아 있으면 ture를 반환.
        //Object next() => 다음 요소를 반환함.
        // void remove() => 컬렉션에서 현재 요소를 삭제함.
        LinkedList<Double> scoreList = new LinkedList<>();
        scoreList.add(new Double(9.5));
        scoreList.add(new Double(7.5));
        scoreList.add(new Double(8.2));
        System.out.println(scoreList.toString());

        double sum = 0;
        Iterator<Double> iterator = scoreList.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("점수 합 : " + sum);


    }
}
