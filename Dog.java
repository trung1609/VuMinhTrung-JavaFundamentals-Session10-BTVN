package Session10.xuatsac1;

public class Dog extends Mammal {
    public void makeSound() {
        System.out.println("Bark Bark!");
    }

    public void fetchBall() {
        System.out.println(super.getName() + " is fetching the ball");
    }

    public void eat() {
        System.out.println(super.getName() + " is eating");
    }

    public void eat(String food) {
        System.out.println(super.getName() + " is eating " + food);
    }
}
