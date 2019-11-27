package Study.Car_ex.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapC {
    public static void main(String[] args) {
        TreeMap<String, String > map = new TreeMap<>();
        map.put("정길용", "010-111-1111");
        map.put("강성윤", "010-222-2222");
        map.put("채규태", "010-333-3333");

        Set<String> keys = map.keySet();
        System.out.println(keys.toString());

        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
