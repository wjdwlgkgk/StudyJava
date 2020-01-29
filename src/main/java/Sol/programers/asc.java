package Sol.programers;

import java.util.ArrayList;
import java.util.Collections;

public class asc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        long n = 118372;

        while(n > 0){
            list.add((int)(n%10));
            n/=10;
        }
        Collections.sort(list);


        System.out.println();

    }
}
