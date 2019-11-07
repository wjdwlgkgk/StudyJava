public class alksvndlaksdvnlkasdTeest {



    public static void main(String args[]){

        String a ="aa";

        String b = "";

        if(b.split("@@") == null)
            System.out.println("b = null");
        else {
            String[] arr = b.split("@@");

            for (int i = 0; i < arr.length; i++)
                System.out.println(arr[i]);
        }
    }
}
