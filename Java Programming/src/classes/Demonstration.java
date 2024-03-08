package classes;

class Circle {
    float x, y, r;

    float circumference() {
        return 2*(22/7)*r;
    }

    Circle(float x, float y, float r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}

class Point {
    int x, y;

    void setPoint() {
        x = 10;
        y = 15;
    }
}
public class Demonstration {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 7);
        Point p = new Point();
        p.setPoint(); // Called to set the point values for x and y

        System.out.println("Circumference is " + c1.circumference());
        System.out.println("The points are " + p.x + " and " + p.y);
    }
}
