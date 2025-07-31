package wrapper_classes_task5;

import java.util.ArrayList;

public class TemperatureConverter_Task7 {
    public static void main(String[] args) {
        String[] tempStrings = {"36", "38", "40"};
        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> fahrenheitList = new ArrayList<>();

        for (String temp : tempStrings) {
            int celsius = Integer.parseInt(temp);
            celsiusList.add(celsius);
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            fahrenheitList.add(fahrenheit);
        }

        for (int i = 0; i < celsiusList.size(); i++) {
            System.out.println("C: " + celsiusList.get(i) + " -> F:" + fahrenheitList.get(i));
        }
    }
}
