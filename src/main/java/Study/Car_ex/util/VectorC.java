package Study.Car_ex.util;

import java.util.Vector;
import java.util.Date;

public class VectorC {
    public static void main(String[] args) {
        //Vector 는 동적인 길이로 다양한 객체들을 저장하기 위해 Vector 클래서 제공.
        //일종의 가변 길이의 배열
        //특징 : 1. 가변배열에는 객체만 저장이 가능. 2. 가변 크기로서 객체의 갯수를 염려할 필요가 없음. 3. 한 객체가 삭제되면 컬렉션이 자동으로 자리를 옮겨줌.
        // 기본 생성자 : 10개의 데이터를 저장할 수 있는 길이의 객체를 생성, 저장공간이 부족하면 10개씩 증가.
        // int size : size 개의 데이터를 저장할 수 있는 길이의 객체를 생성, 저장공간 부족 size개씩 증가.
        // int size, int incr : size 개 생성, incr 씩 증가.
        Vector list = new Vector(3);
        System.out.println("저장 능력 : " + list.capacity());
        System.out.println("저장 요소 개수 : " + list.size());
        list.addElement(new Integer(10));
        list.addElement(new Double(10.0));
        list.addElement(new String("자바"));
        list.addElement(new Date());
        list.add(4, new Integer(3)); // index는 최우선 순위를 가지며, 최대 element 갯수보다 큰 값을 index로 넣으면 Exception
        System.out.println("저장 후");
        System.out.println("저장 능력 : " + list.capacity());
        System.out.println("저장 요소 개수 : " + list.size());

        if (list.contains("자바")) {
            System.out.println("자바 스트링은 " + list.indexOf("자바"));
            System.out.println("번 인덱스에 존재한다.");
        }
        System.out.println("Vector에 저장된 요소들");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번째 요소는 " + list.elementAt(i));
        }
    }
}
