package objects.Constructors;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 0, 5);
//        c1.x = 3;
//        c1.y = 0;
//        c1.r = 5;
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();

        System.out.println("The circumference is " + c1.circumference());
        System.out.println("The circumference is " + c2.circumference());
        System.out.println("The circumference is " + c3.circumference());
        System.out.println("The circumference is " + c4.circumference());

    }
}
