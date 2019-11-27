import java.util.Arrays;

public class kTest {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];
        int anCnt = 0;
        int start, end;
        for(int i = 0 ; i< commands.length; i++){
            start = commands[i][0];
            end = commands[i][1];
            int count = 0;
            int a[] = new int[end-start+1];
            for(int j = start-1 ; j<end; j++){
                a[count]= array[j];
                count++;
            }

            // for(int l = 0 ; l< a.length; l++){
            //     int temp
            //    for(int m = 0 ; m< a.length; m++){
            //    if(a[l] > a[m])
            //    }
            // }
             Arrays.sort(a);

            answer[anCnt] = a[commands[i][2]-1];
            anCnt++;
        }


    }
}
