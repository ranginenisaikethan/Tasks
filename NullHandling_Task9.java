package wrapper_classes_task5;

import java.util.Optional;

public class NullHandling_Task9 {
    public static void main(String[] args) {
        Double balance = null;

        try {
            double amount = balance;
            System.out.println("Unboxed valuee: " + amount);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

        Optional<Double> opt = Optional.ofNullable(balance);
        double safe = opt.orElse(0.0);
        System.out.println("Safe value: " + safe);
    }
}


/*Task 9: Null Handling in Wrapper Classes
Objective: Show wrapper class behavior with nulls.
Task:
 Declare a Double object and set it to null.
 Try unboxing it to double → Catch the NullPointerException.
 Use Optional or default value strategy to fix it*/