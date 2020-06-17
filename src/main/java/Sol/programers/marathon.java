package Sol.programers;

import java.util.ArrayList;
import java.util.HashMap;

public class marathon {

    public static void main(String[] args) {

        String[] participant1 = {"leo","kiki","eden"};
        String[] participant2 = {"marina","josipa","nikola","vinko","filipa"};
        String[] participant3 = {"mislav","stanko","mislav","ana"};

        String[] completion1 = {"eden","kiki"};
        String[] completion2 = {"josipa","filipa","marina","nikola"};
        String[] completion3 = {"stanko","ana","mislav"};

        String anw = solution(participant3,completion3);
        System.out.println(anw);

    }


    public static String solution(String[] participant, String[] completion){

        String anw = null;
        HashMap<String, Integer> map = new HashMap();

        for(String key : participant)
        {
            if(map.get(key) == null)
                map.put(key,1);
            else
                map.replace(key,map.get(key) + 1);
        }


        for(String key : completion)
            map.replace(key,map.get(key) - 1);


        for(String key : map.keySet())
            if(map.get(key) == 1)
                anw = key;


        return anw;
    }


}
