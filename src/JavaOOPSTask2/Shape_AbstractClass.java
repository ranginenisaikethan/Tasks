package JavaOOPSTask2;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Shape_AbstractClass {
    public static void main(String[] args) {
        Shape circlearea = new Circle(12);
        Shape rectanglearea = new Rectangle(3,9);

        System.out.println("Circle area: " + circlearea.area());
        System.out.println("Rectangle area: " + rectanglearea.area());
    }
}
