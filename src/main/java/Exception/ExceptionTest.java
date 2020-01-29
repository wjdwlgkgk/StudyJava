package Exception;

public class ExceptionTest {
    public static void main(String[] args) {

        int a = 10;
        try {
            a = a / 0;
        }catch(Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getLocalizedMessage());
            System.out.println(String.valueOf(e));
        }


        throw new IndexOutOfBoundsException("So hard");

    }
}
