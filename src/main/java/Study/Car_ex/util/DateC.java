package Study.Car_ex.util;

import java.util.*;

public class DateC {

    public static void main(String[] args) {
        Date currentDate = new Date();
        long start = currentDate.getTime();

        System.out.println(currentDate.toString());
        System.out.println(currentDate.toLocaleString());

        for(int i = 0 ; i < 10000; i++)
            System.out.print("1");

        currentDate = new Date();
        long end = currentDate.getTime();
        System.out.println("걸린 시간 : " + (end  - start) + "ms 초");
    }

}
