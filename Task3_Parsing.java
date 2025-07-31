package wrapper_classes_task5;

public class Task3_Parsing {
    public static void main(String[] args) {
        String intStr = "369";
        String doubleStr = "69.69";
        String boolStr = "true";

        int intVal = Integer.parseInt(intStr);
        double doubleVal = Double.parseDouble(doubleStr);
        boolean boolVal = Boolean.parseBoolean(boolStr);

        System.out.println(intVal);
        System.out.println(doubleVal);
        System.out.println(boolVal);
    }
}
