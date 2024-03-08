package objects.Constructors;

public class Circle {
    float x, y, r;

    float circumference() {
        return 2*(22/7)*r;
    }

    //Constructor Usage
//    Circle(float a, float b, float c) {
//        x = a;
//        y = b;
//        r = c;
//    }
    Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle(float r) {
        this.r = r;
    }

    Circle(Circle c) {
        x = c.x;
        y = c.y;
        r = c.r;
    }

    Circle() {
        x = 0;
        y = 0;
        r = 6;
    }
}
