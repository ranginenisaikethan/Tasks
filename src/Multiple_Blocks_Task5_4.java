package Task3_JavaExceptionalHandling;

public class Multiple_Blocks_Task5_4 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int res = 10 / 0;
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }
    }
}
