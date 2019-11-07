package Study.Car_ex;

public class carTest {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.name = "Red";
        myCar.currentGear=0;
        myCar.currentSpeed=0;

        Car myCar2 = new Car();

        if(myCar == myCar2)
            System.out.println("Same");

        if(myCar.equals(myCar2))
            System.out.println("EqualSame");

        System.out.println(myCar);
        System.out.println(myCar.toString());
    }

}
