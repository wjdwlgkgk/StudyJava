package Sol.programers;

public class treasure {
    public static void main(String[] args) {

        int n = 5;
//        int[] arr1 = {46, 33, 33 ,22, 31, 50};
//        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        int[] arr1 = {0,0,0,0,0};
        int[] arr2 = {30,1,21,17,28};


        int[] arr3 = new int[n];
        String[] answer = new String[n];

        for(int i = 0 ; i < n; i++)
            arr3[i] = arr1[i] | arr2[i];

        for(int i = 0 ; i < n; i++){
            StringBuilder a = new StringBuilder();
            while( arr3[i] > 0){
                if(arr3[i]%2 == 0)
                    a.insert(0,' ');
                else if(arr3[i]%2 == 1)
                    a.insert(0,'#');
                arr3[i]/=2;
            }
            if(a.length() <= n-1) {
                int temp = a.length();
                for(int j = 0 ; j<n-temp; j++) {
                    a.insert(0, ' ');
                }
            }
            answer[i] = a.toString();
        }





        for(String c : answer)
            System.out.println(c);


    }
}
