package Sol.programers;

import java.util.ArrayList;

public class moigosa {
    public static void main(String[] args) {

//        int[] answers = {1,2,3,4,5};
//        int[] answers = {3,3,1,4,2,1,2,2};
        int[] answers = {1, 2, 3, 4, 5, 2, 1, 2, 3, 2, 4, 2, 5};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (A[i % 5] == answers[i]) list.set(0, list.get(0) + 1);
            if (B[i % 8] == answers[i]) list.set(1, list.get(1) + 1);
            if (C[i % 10] == answers[i]) list.set(2, list.get(2) + 1);
        }

        int max = Math.max(list.get(0), Math.max(list.get(1), list.get(2)));
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != max) {
                list.set(i, -1);
                count++;
            }
        }


        int[] answer = new int[list.size() - count];
        for (int i = 0; i < list.size() - count; i++) {
            answer[i] = i + 1;
        }

        for (int a : answer)
            System.out.println(a);
    }
}
