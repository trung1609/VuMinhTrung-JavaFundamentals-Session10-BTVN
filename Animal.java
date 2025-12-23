package Session10.xuatsac1;

import java.util.Scanner;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(sc.nextLine());
    }

    public void makeSound() {
        System.out.println("Dong vat keu");
    }

    public void eat() {
    }

    public void eat(String food) {
    }
}
