package Spring.Study.Plain;

public class SoccerPlayer {

    private NikeSoccerBall nikeBall;

    public SoccerPlayer() {
        this.nikeBall = new NikeSoccerBall();
    }

    public void playSoccer() {
        System.out.println("축구선수가 공을 찼다!");
        this.nikeBall.touchBall();
    }



}
