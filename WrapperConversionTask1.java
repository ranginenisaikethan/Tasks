package wrapper_classes_task5;

public class WrapperConversionTask1 {

    public static void main(String[] args) {

        int i = 10;
        double d = 25.75;
        char c = 'A';

        // Convert primitives to wrapper objects
        Integer intWrapper = Integer.valueOf(i);
        Double doubleWrapper = Double.valueOf(d);
        Character charWrapper = Character.valueOf(c);

        // Convert wrappers to primitives
        int i2 = intWrapper.intValue();
        double d2 = doubleWrapper.doubleValue();
        char c2 = charWrapper.charValue();

        // Printint the original and converted valuess
        System.out.println(i + "; " + intWrapper + "; " + i2);
        System.out.println(d +"; "+ doubleWrapper + "; " + d2);
        System.out.println(c + "; " + charWrapper + "; " + c2);
    }
}
