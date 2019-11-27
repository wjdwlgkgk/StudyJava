package Study.Car_ex.Collection;

import java.util.HashSet;

public class HashSetC {
    //AbstractSet을 확장, Set 인터페이스의 모든 메서드를 사용. 추가적 메서드는 정의하지 않음.
    //데이터 저장소로 Hash Table을 사용하기 때문에 Hash 형태의 자료구조를 구현함.
    // 객체의 저장이나 삭제 시 내부적으로 대상 객체를 hashing하여 HashCode를 만든 뒤 Hash Table의 index로 사용함.
    // 객체를 hashing하는 작업은 자동으로 수행되기 때문에 Hash Table을 직접 접근할 수 없음.
    // 삽입, 삭제 등의 작업이 데이터의 수와 관계없이 일정한 성능을 보장함.
    // Set 자료구조는 1. 중복을 허용하지 않기 때문에 동일한 객체를 여러번 저장할 수 없음. 2. 순서를 보장하지 않기 때문에 저장한 순서로 출력되지 않음.
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5"); //중복을 허용하지 않기 때문에 무시된다.

        set.add("6.7");
        System.out.println(set.toString());

        set.remove("9.2");
        System.out.println(set.toString());
    }

}
