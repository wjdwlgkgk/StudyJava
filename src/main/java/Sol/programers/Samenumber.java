package Sol.programers;

import java.util.ArrayList;

public class Samenumber {

    public static void main(String[] args) {

//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {1,2,3,4,6,7,5,8,9,0,1};
//        int[] arr = {4, 4, 4, 3, 3};

        int[] result = solution(arr);

        for(int insu : result)
            System.out.print(insu);
    }



        public static int[] solution(int []arr) {
            ArrayList<Integer> intArr = new ArrayList<>();

            for(int i = 0 ; i < arr.length-1; i++){
                if (arr[i] != arr[i + 1]) {
                    intArr.add(arr[i]);
                }
                if( i == arr.length-2) {
                    if (arr[i] == arr[i + 1]) {
                        intArr.add(arr[i]);
                    }
                    if (arr[i] != arr[i + 1]) {
                        intArr.add(arr[i+1]);
                    }
                }
            }

            int count = 0;
            int[] anw = new int[intArr.size()];
            for(int insu : intArr){
                anw[count++] = insu;
            }

            return anw;
        }
}
