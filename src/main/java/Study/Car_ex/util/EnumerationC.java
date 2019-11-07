package Study.Car_ex.util;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationC {
    public static void main(String[] args) {
        //Enumeration은 인터페이스이므로, 직접 new 연산자를 이용하여 객체를 생성할 수 없음.
        // 객체들의 집합에 각각의 객체들을 한 순간에 하나씩 처리할 수 있는 메서드를 제공한다.
        //boolean hasMoreElements() : Vector로부터 생성된 Enumeration의 요소가 있으면 true, 아니면 false를 반환함.
        //object nextElement() : Enumeration 내의 다음 요소를 반환함.
        //Enumeration 인터페이스에 선언된 메서드는 그 인터페이스를 사용하는 클래스로 구현해서 사용해야 함
        //Vector클래스의 elements()라는 메서드에 의해 생성
        Vector list = new Vector(5);
        list.addElement(new Integer(10));
        list.addElement(new Double(10.9));
        list.addElement(new String("자바"));
        System.out.println("요소");
        for(int i = 0 ; i < list.size(); i++)
        {
            System.out.println("list의 "  + i + "번째 요소 : " + list.elementAt(i));
        }
        Enumeration e = list.elements(); // new 연산자를 이용하여 생성할 수 없음.
        System.out.println();
        System.out.println("Vector로 부터 생성한 Enumeration 요소들");
        while(e.hasMoreElements()){
            System.out.println("e의 요소 : " + e.nextElement());
        }


    }
}
