package Task3_JavaExceptionalHandling;

public class custom_excep_Task5_5 {
	public class InvalidAccountException extends Exception {
}
    public void InvalidAccountException(String msg) {
    }
    public class Task5 {
        static void checkAccount(String accNumber) throws InvalidAccountException {
            if (!accNumber.equals("123456")) {
                throw new InvalidAccountException();
            } else {
                System.out.println("Access granted");
            }
        }

        public static void main(String[] args) {
            try {
                checkAccount("000000");
            } catch (InvalidAccountException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
