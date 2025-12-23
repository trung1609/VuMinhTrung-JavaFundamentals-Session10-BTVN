package Session10.xuatsac2;

import java.util.Scanner;

public class VehicleApp {
    public static MotorVehicle[] arrVehicle = new MotorVehicle[10];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("============ VEHICLE MANAGEMENT MENU ============");
            System.out.println("1. Hiển thị thông tin tất cả phương tiện");
            System.out.println("2. Kiểm tra Overriding: startEngine()");
            System.out.println("3. Kiểm tra Overloading: move()");
            System.out.println("4. Kiểm tra đa hình runtime (mảng Vehicle[])");
            System.out.println("5. Gọi các hành vi đặc trưng theo loại");
            System.out.println("6. Thêm phương tiện mới (Car/Motorcycle/Truck)");
            System.out.println("0. Thoát");
            System.out.println("=================================================");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if (currentIndex == 0) {
                        System.out.println("Chua co xe nao duoc them");
                    } else {
                        System.out.println("--- THONG TIN PHUONG TIEN ---");
                        for (int i = 0; i < currentIndex; i++) {
                            arrVehicle[i].showInfo();
                        }
                    }
                    break;
                case 2:
                    System.out.println("--- OVERRIDING: startEngine() ---");
                    checkOverriding();
                    break;
                case 3:
                    System.out.println("--- OVERLOADING: move() ---");
                    checkOverloading();
                    break;
                case 4:
                    System.out.println("--- POLYMORPHISM RUNTIME ---");
                    checkOverriding();
                    break;
                case 5:
                    System.out.println("--- HANH VI DAC TRUNG CUA TUNG LOAI ---");
                    checkMethod();
                    break;
                case 6:
                    addVehicle(scanner);
                    break;
                default:
            }
        } while (true);
    }

    public static void addVehicle(Scanner scanner) {
        System.out.println("1. Them xe o to");
        System.out.println("2. Them xe may");
        System.out.println("3. Them xe tai");
        System.out.print("Lua chon cua ban: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                arrVehicle[currentIndex] = new Car();
                arrVehicle[currentIndex].input(scanner);
                currentIndex++;
                break;
            case 2:
                arrVehicle[currentIndex] = new Motorcycle();
                arrVehicle[currentIndex].input(scanner);
                currentIndex++;
                break;
            case 3:
                arrVehicle[currentIndex] = new Truck();
                arrVehicle[currentIndex].input(scanner);
                currentIndex++;
                break;
            default:
                System.err.println("Vui long nhap tu 1-3");
        }
    }

    public static void checkOverriding() {
        if (currentIndex == 0) {
            System.out.println("Chua co xe nao duoc them");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                arrVehicle[i].startEngine();
            }
        }
    }

    public static void checkOverloading() {
        if (currentIndex == 0) {
            System.out.println("Chua co xe nao duoc them");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                if (arrVehicle[i] instanceof Car) {
                    arrVehicle[i].move();
                    arrVehicle[i].move(60);
                } else if (arrVehicle[i] instanceof Motorcycle) {
                    arrVehicle[i].move();
                    arrVehicle[i].move(80);
                } else if (arrVehicle[i] instanceof Truck) {
                    arrVehicle[i].move();
                    arrVehicle[i].move(40);
                }
            }
        }
    }

    public static void checkMethod() {
        if (currentIndex == 0) {
            System.out.println("Chua co xe nao duoc them");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                if (arrVehicle[i] instanceof Car) {
                    ((Car) arrVehicle[i]).openTrunk();
                } else if (arrVehicle[i] instanceof Motorcycle) {
                    ((Motorcycle) arrVehicle[i]).doWheelie();
                } else if (arrVehicle[i] instanceof Truck) {
                    ((Truck) arrVehicle[i]).loadCargo();
                }
            }
        }
    }
}
