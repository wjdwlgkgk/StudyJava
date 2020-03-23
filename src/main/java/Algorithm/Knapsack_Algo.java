package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Knapsack_Algo {

    static int N = 5;
    static int V = 1;
    static int items[][] = {
            {5,8},
            {8,11},
            {3,3},
            {4,6},
            {2,4}
    };

    public static void main(String[] args) {

        int Max = steal(3,3);


        }


        public static int steal(int pos, int capacity) {

            if (pos == N) return 0;
            return 0;
        }



}

class item {
    int weight;
    int value;
    public item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}