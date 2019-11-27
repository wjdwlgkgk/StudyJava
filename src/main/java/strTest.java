public class strTest {
    public static void main(String[] args) {

        String s = "AB";
        int n = 1;

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != ' '){

                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    if(s.charAt(i) + n > 90){
                        sb.append((char)(s.charAt(i) - 26 + n));
                    }
                    else
                        sb.append((char)(s.charAt(i) + n));
                }
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    if(s.charAt(i) + n > 122){
                        sb.append((char)(s.charAt(i) - 26 + n));
                    }
                    else
                        sb.append((char)(s.charAt(i) + n));
                }
            }
            else
                sb.append(" ");
        }
        System.out.println(sb.toString());


    }
}
