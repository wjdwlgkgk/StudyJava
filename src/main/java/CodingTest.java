public class CodingTest {

    public static void main(String args[]){


        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 3;
        int[] answer = {0,0};
        int charae = 0;
        boolean flag = false;

        for(int i = 0 ; i < words.length-1; i++){
            if(flag) break;
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                //틀림.
                charae = i+2;
                break;
            }

            for(int j = i+1 ; j< words.length; j++){
                if(words[i].matches(words[j])){
                    //틀림.
                    charae = j+1;
                    flag = true;
                    break;
                }
            }
        }

        if(charae != 0){
            if(charae%n == 0)
                answer[0] = n;
            else
                answer[0] = charae%n;
            answer[1] = (int)Math.ceil((double) charae / n);
        }

        System.out.println(answer[0] + " : " + answer[1]);
        // 검사 1 : 끝자리와 앞자리가 일치하는지.
        // 검사 2 : 같은 단어를 반복하지는 않았는지.


    }
}
