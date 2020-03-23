package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);

        Integer[] a = new Integer[aList.size()];
        a = aList.toArray(a);

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        Arrays.sort(a);
    }
}
