package Session10.xuatsac1;

import java.util.Scanner;

public class Mammal extends Animal {
    private HasFur hasFur;

    public Mammal() {
    }

    public Mammal(String name, int age, HasFur hasFur) {
        super(name, age);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Has Fur: " + hasFur);
        System.out.println();
    }
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Co long hay khong (TRUE/FALSE): ");
        this.hasFur = HasFur.valueOf(sc.nextLine());
    }
}
