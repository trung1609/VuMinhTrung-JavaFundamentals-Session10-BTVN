package Session10.xuatsac2;

public class Motorcycle extends MotorVehicle {
    public void startEngine() {
        System.out.println(super.getBrand() + " (Motorcycle) engine starts: Brum Brum!");
    }

    public void doWheelie() {
        System.out.println(super.getBrand() + " is doing a wheelie!");
    }

    public void move() {
        System.out.println(super.getBrand() + " is moving");
    }

    public void move(int spped) {
        System.out.println(super.getBrand() + " is moving at " + spped + " km/h");
    }
}
