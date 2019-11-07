package Study.Car_ex;

public class Car {
    String name;
    int currentSpeed;
    int currentGear;
    void startEngine(){
        currentSpeed = 1;
    }
    void changeGear(int gear){
        currentGear = gear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    void stopEngine(){
        currentSpeed = 0;
    }
}
