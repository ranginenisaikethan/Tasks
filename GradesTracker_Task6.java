package wrapper_classes_task5;

import java.util.ArrayList;
import java.util.Collections;

public class GradesTracker_Task6 {
    public static void main(String[] args) {
        // Create ArrayList<Integer>
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(85);
        marks.add(67);
        marks.add(90);
        marks.add(72);

        System.out.println("Original marks: " + marks);

        //Remove the lowest mark
        Integer minMark = Collections.min(marks);
        marks.remove(minMark);  // removes first occurrence of lowest mark
        System.out.println("After removing lowest mark (" + minMark + "): " + marks);

        // Print max, min, average
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.size();

        System.out.println("Maximum Mark: " + max);
        System.out.println("Minimum Mark: " + min);
        System.out.println("Average Mark: " + average);
    }
}
