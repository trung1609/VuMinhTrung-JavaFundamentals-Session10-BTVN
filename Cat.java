package Session10.xuatsac1;

public class Cat extends Mammal {
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    public void climbTree() {
        System.out.println(super.getName() + " is climbing a tree");
    }

    public void eat() {
        System.out.println(super.getName() + " is eating");
    }

    public void eat(String food) {
        System.out.println(super.getName() + " is eating " + food);
    }
}
