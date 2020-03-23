package Study.Car_ex.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueC {
    public static void main(String[] args) {
        //큐는 줄이라는 의미를 가지고 있음.
        // 데이터 제거가 1번에 있고, 마지막번에 있는 사람이 삽입된 사람임.
        //선입 선출 : FIFO 가장 전 데이터 : front 가장 마지막 입력 데이터 : rear
        //insert는 rear 뒤에 붙고, remove는 front부터 시작한다.
        //front를 읽는 작업 : peek => 이는 읽는 작업만 수행함으로 front 값을 변경시키지 않음.
        // Queue는 인터페이스 이기때문에 LinkedList로 선언.
        Queue<String> queue = new LinkedList<String>();
        for (int i = 1; i <= 3; i++)
            ((LinkedList<String>) queue).add("데이터-" + i);

        System.out.println("가장 앞 : front 값");
        System.out.println(queue.peek());
        System.out.println("순차적으로 꺼내기");
        // remove와 poll이 같다.
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // 큐가 비어있으면 역시 NoSuchElementException 발생.
        System.out.println(queue.remove());


    }
}
