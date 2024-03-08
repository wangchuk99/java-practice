package objects;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.x = 0;
        c1.y = 0;
        c1.r = 5;

        c2.x = 3;
        c2.y = 4;
        c2.r = 10;

        System.out.println("Circumference of circle 1 is " + c1.circumference());
        System.out.println("Area of circle 1 is " + c1.area());
        System.out.println("Circumference of circle 2 is " + c2.circumference());
        System.out.println("Area of circle 2 is " + c2.area());
    }
}
