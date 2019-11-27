package Study.Car_ex.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapC {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("정길용", "010-111-1111");
        map.put("강성윤", "010-222-2222");
        map.put("채규태", "010-333-3333");

        Set<String> keys = map.keySet();
        System.out.println(keys.toString());

        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
