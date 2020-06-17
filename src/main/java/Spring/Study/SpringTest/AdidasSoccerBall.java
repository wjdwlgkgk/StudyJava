package Spring.Study.SpringTest;


import org.springframework.stereotype.Component;

@Component("adidasBall")
public class AdidasSoccerBall implements SoccerBall {
    public String touchBall() {
        return "아디다스 축구공이 굴러간다.";
    }
}
