package Session10.kha2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2,3);
        Shape s2 = new Circle(5);
        s1.area();
        s2.area();

        System.out.println("Area of s1 is: " + s1.area());
        System.out.println("Area of s2 is: " + s2.area());
    }
}
