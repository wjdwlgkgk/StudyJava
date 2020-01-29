package Sol.programers;

import java.util.ArrayList;
import java.util.List;

public class rmMinnum {
    public static void main(String[] args) {

        int[] arr = {4,3,2,1};

        if(arr.length == 1) {
            int[] answer = {-1};
        }
        else{
            int min = 9999;
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < arr.length; i++){
                if(min > arr[i])
                    min = arr[i];
                list.add(arr[i]);
            }

            int idx = -1;
            for(int i = 0 ; i < arr.length; i++){
                if(min == arr[i])
                    idx = i;
            }
            list.remove(idx);

            int[] answer = new int[list.size()];
            int count = 0;
            for(int a : list){
                answer[count] = a;
                count++;
            }

        }

    }
}
