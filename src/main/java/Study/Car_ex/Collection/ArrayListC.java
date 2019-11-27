package Study.Car_ex.Collection;

import java.util.ArrayList;

public class ArrayListC {
    public static void main(String[] args) {
        ArrayList<Double> scoreList = new ArrayList<>();
        scoreList.add(9.5);
        scoreList.add(8.4);
        scoreList.add(1, 9.2);
        scoreList.add(9.5);

        System.out.println(scoreList.toString());

        double minScore = 100;
        double maxScore = 0;
        double score = 0;
        for(int i = 0 ; i < scoreList.size(); i++) {
            score = scoreList.get(i);
            if (score < minScore) {
                minScore = score;
            }
            if (score > maxScore) {
                maxScore = score;
            }
        }
            scoreList.remove(minScore);
            scoreList.remove(maxScore);
            System.out.println(scoreList.toString());

            double sum = 0;
            for(int i = 0 ; i< scoreList.size(); i++){
                sum += scoreList.get(i);
            }
        System.out.println("최저 점수 : " + minScore);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("평균 점수 : " + (sum / scoreList.size()));

        }

}
