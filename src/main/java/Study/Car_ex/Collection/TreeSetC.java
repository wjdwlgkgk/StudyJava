package Study.Car_ex.Collection;

import java.util.TreeSet;

public class TreeSetC {
    public static void main(String[] args) {
        //AbstractSet을 확장하며 SortedSet 인터페이스를 구현함. -> 오름차순으로 정렬된 Set 집합을 사용할 수 있음.
        // 기억 장소로 트리를 사용하여 빠른 접근 속도를 가지므로, 많은 양의 데이터를 정렬하여 사용할 때 유용함.
        TreeSet<String> set = new TreeSet<>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5");
        set.add("6.7");
        System.out.println(set.toString());

        set.remove("9.2");
        System.out.println(set.toString());
    }
}
