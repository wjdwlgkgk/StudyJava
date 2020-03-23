package Sol.programers;

public class rkflrl {
    public static void main(String[] args) {
        String a = "01033334444";
        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i < sb.length() - 4; i++) {
            sb.setCharAt(i, '*');
        }

        System.out.println(sb.toString());
    }
}
