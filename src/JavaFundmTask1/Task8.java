package JavaFundmTask1;

public class Task8 {
    public static void main(String[] args) {

        int a = 5;
        int b = a++;
        int c = ++a; // easy to use other than using (++x) or (x--)

        System.out.println(b); 
        System.out.println(a);
        System.out.println(c);

        int num = 16;
        int leftShift = num << 2;
        int rightShift = num >> 2;

        System.out.println(leftShift);
        System.out.println(rightShift);
        
        int num2=10;
        int num3=20;
        if(num2!=num3) {
        	System.out.println("Print not equal");
        }
        else {
        	System.out.println("print equal");
        }

        int x = 5, y = 10;

        boolean result1 = (x < y) & (x < 10);
        System.out.println(result1);
    }
}