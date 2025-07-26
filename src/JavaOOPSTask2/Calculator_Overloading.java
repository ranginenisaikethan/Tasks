package JavaOOPSTask2;

public class Calculator_Overloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator_Overloading calc = new Calculator_Overloading();

        System.out.println(calc.add(6, 9));           
        System.out.println(calc.add(3.14, 1.86));          
        System.out.println(calc.add("Sai, ", "Kethan"));
    }
}
