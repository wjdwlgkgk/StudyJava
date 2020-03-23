package StringTest;

public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abf");


        if (a == b.intern())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
