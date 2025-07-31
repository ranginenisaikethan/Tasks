package wrapper_classes_task5;

import java.util.Arrays;

public class WrapperSort_Task10 {
    public static void main(String[] args) {
        Integer[] numbers = {45, 12, 78, 34, 89, 23};

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers)); //Sorted: [12, 23, 34, 45, 78, 89]
        
        int secondHighest = numbers[numbers.length - 2];
        System.out.println("Second highest: " + secondHighest);
        
    }
}