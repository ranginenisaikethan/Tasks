package Task3_JavaExceptionalHandling;

public class Task3_2 {
    
    static class Vehicle {
        final void engineType() {
            System.out.println("Generic engine");
        }
    }

    static class Car extends Vehicle {
        // Cannot override engineType() because it is final
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.engineType(); // Output: Generic engine
    }
}
