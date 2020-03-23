package Study.Car_ex.util;

import java.util.Arrays;

public class ArraysC {
    public static void main(String[] args) {
        int[] a = new int[8];
        int b[] = {34, 98, 79, 55, 56, 76, 87};

        Arrays.sort(b);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " , ");

        System.out.println();
        System.out.println("최저 : " + b[0]);
        System.out.println("최고 : " + b[6]);


    }
}
