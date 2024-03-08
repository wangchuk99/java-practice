package objects;

public class Circle {
    float x, y, r; //x and y are center coordinates of the circle and r is the radius.

    float circumference() {
        return 2*(22/7)*r;
    }

    float area() {
        return (22/7)*r*r;
    }
}
