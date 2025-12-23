package Session10.xuatsac2;

public class Car extends MotorVehicle {
    public void startEngine() {
        System.out.println(super.getBrand() + " (Car) engine starts: Vroom Vroom!");
    }

    public void openTrunk() {
        System.out.println(super.getBrand() + " trunk is opening...");
    }

    public void move() {
        System.out.println(super.getBrand() + " is moving");
    }

    public void move(int spped) {
        System.out.println(super.getBrand() + " is moving at " + spped + " km/h");
    }
}
