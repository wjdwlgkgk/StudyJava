import java.lang.Object;
import java.lang.Exception;
import java.lang.Runtime;

public class cpu extends Object {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        int pn = rt.availableProcessors();
        String str = Integer.toString(pn);
        System.out.println("Processor number: " + str);

        String a = "6";


        System.out.println(Integer.parseInt(a) / 2);
    }
}