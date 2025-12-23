package Session10.xuatsac2;

import java.util.Scanner;

public class MotorVehicle extends Vehicle {
    private FuelType fuelType;

    public MotorVehicle() {
    }

    public MotorVehicle(String brand, int year, FuelType fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("-------------------------");
    }

    public void input(Scanner scanner){
        super.input(scanner);
        System.out.print("Nhap fuel type: ");
        fuelType = FuelType.valueOf(scanner.nextLine());
    }
}
