package OPP_practice.OOP_4th;

public class Car {
    private String color;
    private int gear;
    private int speed;

    public Car(String color, int gear, int speed) {
        this.color = color;
        this.gear = gear;
        this.speed = speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
        getGear();
    }

    public void speedUp() {
        speed += 10;
        getSpeed();
    }

    public void speedDown() {
        if (speed < 10) {
            System.out.println("더 이상 감속할 수 없습니다.");
        } else if (speed == 10) {
            stop();
        } else {
            speed -= 10;
        }
        getSpeed();
    }

    public void stop() {
        System.out.println("자동차 시동을 끕니다.");
        speed = 0;
    }

    public void getColor() {
        System.out.println("자동차 색상: " + color);
    }

    public void getSpeed() {
        System.out.println("현재 속도: " + speed);
    }

    public void getGear() {
        System.out.println("현재 기어: " + gear);
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }
}

