package wrapper_classes_task5;

class Box<T> {
 private T value;

 public void setValue(T value) {
     this.value = value;
 }

 // Method to get value
 public T getValue() {
     return value;
 }
}

public class GenericWrapperDemo_Task5 {
 public static void main(String[] args) {
     
     // Box for Integer
     Box<Integer> intBox = new Box<>();
     intBox.setValue(100);  // autoboxing from int to integer
     System.out.println("Integer value: " + intBox.getValue());

     // Box for Double
     Box<Double> doubleBox = new Box<>();
     doubleBox.setValue(99.99);  // autoboxing from double to double
     System.out.println("Double value: " + doubleBox.getValue());
 }
}

