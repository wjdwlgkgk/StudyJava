import java.math.BigInteger;

public class TestTest1234 {
    public static void main(String[] args) {

        StringBuffer Pn = new StringBuffer();
        StringBuffer Pk = new StringBuffer();

        Pn.append("0");
        Pk.append("0");
        for (int j = 0; j < 7; j++) {
            Pk.append("0");
            Pk.append(fFunc(gFunc(Pn)));
            Pn = new StringBuffer();
            Pn.append(Pk);
        }

        System.out.println(Pk.charAt(53));


    }

    public static StringBuffer gFunc(StringBuffer sb) {
        StringBuffer a = new StringBuffer();
        a.append(sb);
        a.reverse();
        return a;
    }

    public static StringBuffer fFunc(StringBuffer sb) {
        StringBuffer a = new StringBuffer();
        a.append(sb);
        for (int i = 0; i < sb.length(); i++) {
            if (a.charAt(i) == '0') a.setCharAt(i, '1');
            else if (a.charAt(i) == '1') a.setCharAt(i, '0');
        }
        return a;
    }


}
