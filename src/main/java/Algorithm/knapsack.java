package Algorithm;

public class knapsack {
    private static int W=0;
    private static int V=1;
    private static int N=5;
    private static int Max=1000;
    private static int dp[][] = new int[N][Max];
    private static int items[][]=
            {
                    {5,8},
                    {8,11},
                    {3,3},
                    {4,6},
                    {2,4}
            };

    public static void main(String[] args) {
        int capacity = 15;
        System.out.println("Knapsack(0,"+ capacity + ") = "+ knapsack(0,capacity) +"\n");
    }

    public static int knapsack(int pos, int capacity){
        if(pos == N) return 0;
        int ret = 0;
        if(items[pos][W] <= capacity)
        {
            ret = knapsack(pos + 1, capacity - items[pos][W]) + items[pos][V];
            ret = MAX(ret, knapsack(pos + 1, capacity));
        }
        return 0;
    }

    public static int MAX(int a, int b){
        if(a>b) return a;
        else return b;
    }


}
