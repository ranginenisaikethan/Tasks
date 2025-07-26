package Task3_JavaExceptionalHandling;

public class Throw_Task5_3 {
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage()); // throws msg 
        }
    }
}
