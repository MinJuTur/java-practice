package OPP_practice.OOP_4th;

public class CarTest {
    public static void main(String[] args) {
        Car redCar = new Car("red", 2, 80);
        redCar.changeGear(1);
        redCar.speedUp();
        System.out.println(redCar);
    }
}
