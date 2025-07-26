package Task3_JavaExceptionalHandling;

abstract class Shape1 {
    abstract double area();

    void displayShapeType() {
        System.out.println("This is a shape");
    }
}

class Circle1 extends Shape1 {
    double r;

    Circle1(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }
}
class Rectangle1 extends Shape1 {
    double l, w;

    Rectangle1(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double area() {
        return l * w;
    }
}
public class Shape_Task_1_2 {
    public static void main(String[] args) {
    	// ciccle
        Circle1 c = new Circle1(2);
        c.displayShapeType();
        System.out.println("Area: " + c.area());
        // rectangle
        Rectangle1 r = new Rectangle1(3, 4);
        r.displayShapeType();
        System.out.println("Area: " + r.area());
    }
}
