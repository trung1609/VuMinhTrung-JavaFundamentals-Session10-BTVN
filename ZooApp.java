package Session10.xuatsac1;

import java.util.Scanner;

public class ZooApp {
    public static Mammal[] arrAnimal = new Mammal[10];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("================= ZOO MANAGEMENT MENU ==================");
            System.out.println("1. Tao doi tuong va hien thi thong tin");
            System.out.println("2. Kiem tra Overriding: goi makeSound() cua tung con vat");
            System.out.println("3. Kiem tra Overloading: goi eat() va eat(String)");
            System.out.println("4. Kiem tra da hinh runtime (Animal array)");
            System.out.println("5. Goi phuong thuc dac trung cua tung loai");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("========================================================");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("--- THEM DONG VAT ---");
                    addAnimal(sc);
                    System.out.println("--- THONG TIN CAC DONG VAT ---");
                    showAnimal();
                    break;
                case 2:
                    System.out.println("--- OVERRIDING: makeSound() ---");
                    checkOverriding();
                    break;
                case 3:
                    System.out.println("--- OVERLOADING: eat() ---");
                    checkOverloading();
                    break;
                case 4:
                    System.out.println("--- POLYMORPHISM RUNTIME ---");
                    checkOverriding();
                    break;
                case 5:
                    System.out.println("--- PHUONG THUC RIENG CUA TUNG LOAI ---");
                    checkMethod();
                    break;
                default:
                    System.err.println("Vui long nhap tu 1-5");
            }
        } while (true);
    }

    public static void addAnimal(Scanner sc) {
        System.out.print("Them con vat (cho/meo/voi): ");
        String choice = sc.nextLine();
        if (choice.equals("meo")) {
            arrAnimal[currentIndex] = new Cat();
            arrAnimal[currentIndex].input(sc);
            currentIndex++;
        } else if (choice.equals("voi")) {
            arrAnimal[currentIndex] = new Elephant();
            arrAnimal[currentIndex].input(sc);
            currentIndex++;
        } else if (choice.equals("cho")) {
            arrAnimal[currentIndex] = new Dog();
            arrAnimal[currentIndex].input(sc);
            currentIndex++;
        } else {
            System.err.println("Vui long nhap dung con vat can them");
        }
    }

    public static void showAnimal() {
        for (int i = 0; i < currentIndex; i++) {
            arrAnimal[i].showInfo();
        }
    }

    public static void checkOverriding() {
        for (int i = 0; i < currentIndex; i++) {
            arrAnimal[i].makeSound();
        }
    }

    public static void checkOverloading() {
        for (int i = 0; i < currentIndex; i++) {
            if (arrAnimal[i] instanceof Dog) {
                arrAnimal[i].eat();
                arrAnimal[i].eat("meat");
            } else if (arrAnimal[i] instanceof Cat) {
                arrAnimal[i].eat();
                arrAnimal[i].eat("fish");
            } else if (arrAnimal[i] instanceof Elephant) {
                arrAnimal[i].eat();
                arrAnimal[i].eat("grazers");
            }
        }
    }

    public static void checkMethod() {
        for (int i = 0; i < currentIndex; i++) {
            if (arrAnimal[i] instanceof Dog) {
                ((Dog) arrAnimal[i]).fetchBall();
            } else if (arrAnimal[i] instanceof Cat) {
                ((Cat) arrAnimal[i]).climbTree();
            } else if (arrAnimal[i] instanceof Elephant) {
                ((Elephant) arrAnimal[i]).sprayWater();
            }
        }
    }
}
