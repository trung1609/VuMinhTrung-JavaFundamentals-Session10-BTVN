package Session10.xuatsac2;

import java.util.Scanner;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showInfo() {
        System.out.printf("Brand: %s, Year: %d\n", this.brand, this.year);
    }

    public void startEngine() {
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public void move(int spped) {
        System.out.printf("Vehicle is moving at %d km/h.\n", spped);
    }
    public void input(Scanner scanner) {
        System.out.print("Nhap brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Nhap year: ");
        this.year = Integer.parseInt(scanner.nextLine());
    }
}
