package Session10.gioi2;

public class Car {
    public static int currentSpeed = 0;

    public static void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +" + currentSpeed + " km/h");
    }

    public static void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    public static void accelerate(int speed, int seconds) {
        int increase = (speed * seconds);
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }

    public void printStatus() {
        System.out.println("Current Speed: " + currentSpeed + " km/h");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.printStatus();
        System.out.println();
        c.accelerate(20);
        c.printStatus();
        System.out.println();
        c.accelerate(10, 2);
        c.printStatus();
    }
}
