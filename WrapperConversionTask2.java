package wrapper_classes_task5;

import java.util.*;

public class WrapperConversionTask2 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.5);
        list.add(20.0);
        list.add(30.5);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            sum += list.get(i);
        }

        System.out.println(sum / list.size());
    }
}
