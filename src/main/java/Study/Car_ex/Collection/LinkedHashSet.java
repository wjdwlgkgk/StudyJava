package Study.Car_ex.Collection;

public class LinkedHashSet {
    public static void main(String[] args) {
        //HashSet은 삽입된 순서를 기억하지 않고,
        //LinkedHashSet은 연결 리스트를 이용하여 삽입된 데이터의 순서를 기억함,
        //생성자는 HashSet과 동일하며 추가적 메서드는 정의되지 않음.
        java.util.LinkedHashSet<String> set = new java.util.LinkedHashSet<>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5");
        set.add("6.7");
        System.out.println(set.toString());

        set.remove("9.2");
        System.out.println(set.toString());
        //중간에 데이터를 삭제해도 데이터의 순서가 유지됨.
    }
}
