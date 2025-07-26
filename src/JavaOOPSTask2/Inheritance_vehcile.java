package JavaOOPSTask2;

class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand, double d) {
        this.brand = brand;
        this.speed = d;
    }

    void showDetails() {
        System.out.println("Vehicle brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    Car(String brand, double d) {
        super(brand, d);
    }

    @Override
    void showDetails() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h"); // overriding 1
    }
}

class Bike extends Vehicle {
    Bike(String brand, double d) {
        super(brand, d);
    }

    @Override
    void showDetails() {
        System.out.println("Bike brand: " + brand + ", Speed: " + speed + " km/h"); // overriding 2
    }
}

public class Inheritance_vehcile {
    public static void main(String[] args) {
        Vehicle v1 = new Car("BenZ", 210.5);
        Vehicle v2 = new Bike("Yamaha", 111.11);

        v1.showDetails();
        v2.showDetails();
    }
}
