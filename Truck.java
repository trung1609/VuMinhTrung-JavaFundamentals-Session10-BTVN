package Session10.xuatsac2;

public class Truck extends MotorVehicle {
    public void startEngine() {
        System.out.println(super.getBrand() + " (Truck) engine starts: RRRRRRRR!");
    }

    public void loadCargo() {
        System.out.println(super.getBrand() + " is loading a cargo!");
    }

    public void move() {
        System.out.println(super.getBrand() + " is moving");
    }

    public void move(int spped) {
        System.out.println(super.getBrand() + " is moving at " + spped + " km/h");
    }
}
