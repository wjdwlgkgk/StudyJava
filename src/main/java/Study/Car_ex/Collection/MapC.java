package Study.Car_ex.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapC {
    public static void main(String[] args) {
        //Map은 key, value의 쌍으로 데이터를 저장하는 객체.
        // Key는 유일해야하며, value는 중복이 가능함.
        //기능적으로 collection 인터페이스와 다르기 때문에 collection 인터페이스를 상속받지 않음. -> iterator를 사용하지 않는 것을 보면됨. enumeration도
        //hashmap , linkedhashmap 중요.
        // Set keySet() 메소드 : 맵에 있는 모든 ket를 포함하는 Set을 반환함.
        // Collection values() 메소드 : 맵에 있는 모든 value를 포함하는 Set을 반환함.
        //HashMap 클래스 : 키와 데이터값의 한쌍으로 묶어서 관리하며 키의 중복을 허용하지 않음. -> 비슷한 Map : HashMap, HashTable, TreeMap
        //그렇기 때문에 Enumeration이나 Iterator 객체를 사용하여 데이터를 추출하지 않고 특정 키로 등록된 데이터를 추출함.
        //containsKey() 지정한 키가 존재하는지 여부를 반환. containsValue() 지정한 값이 존재하는지 여부를 반환.
        // 순서가 없다.
        HashMap<String, String> map = new HashMap<>();
        map.put("정길용","010-111-1111");
        map.put("정길용","010-222-2222"); // 중복 되면 key값에 있는 value를 변경해준다.
        map.put("강성윤","010-222-2222");
        map.put("채규태","010-333-3333");

        Set<String> keys = map.keySet();
        System.out.println(keys.toString());

        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
