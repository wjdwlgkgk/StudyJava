public class IPdivide {
    public static void main(String[] args) {
        String ip = "192.168.122.66";
        String[] a = ip.split("\\.");

        for(String c:a)
        {
            System.out.println(c);
        }
    }
}
