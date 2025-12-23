package Session10.xuatsac1;

public class Elephant extends Mammal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    public void sprayWater() {
        System.out.println(super.getName() + " is spraying water");
    }

    public void eat() {
        System.out.println(super.getName() + " is eating");
    }

    public void eat(String food) {
        System.out.println(super.getName() + " is eating " + food);
    }
}
