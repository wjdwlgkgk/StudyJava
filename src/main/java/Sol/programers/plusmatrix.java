package Sol.programers;

public class plusmatrix {
    public static void main(String[] args) {


//        String s = "A       a  asd   asdada  asdad  asd sad as asd as dsad";
        String s = "try   hello world";

        String[] sptS = s.split(" ",-1);
        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i < sptS.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(sptS[i]);
            for(int j = 0 ; j < sptS[i].length(); j++) {
                if(j % 2 == 0){
                    if(sptS[i].charAt(j) >= 'a' && sptS[i].charAt(j) <= 'z')sb.setCharAt(j,(char)(sptS[i].charAt(j) - 32));
                }
                else{
                    if(sptS[i].charAt(j) >= 'A' && sptS[i].charAt(j) <= 'Z')sb.setCharAt(j,(char)(sptS[i].charAt(j) + 32));
                }
            }
            if(i == sptS.length - 1)
                answer.append(sb);
            else
                answer.append(sb + " ");
        }
        System.out.println(answer.toString());


    }
}
