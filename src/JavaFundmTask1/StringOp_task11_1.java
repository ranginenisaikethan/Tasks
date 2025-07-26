package JavaFundmTask1;


public class StringOp_task11_1 {

	public static void main(String[] args) {
		String name = "Rangineni Saikethan";
		System.out.println("String Length= "+ name.length());
		System.out.println("CAPS= "+ name.toUpperCase());
		System.out.println("LOWS="+ name.toLowerCase());
        String sub = name.substring(0, 5);
        System.out.println("Substring (0 to 5): " + sub);
        System.out.println("Letter at inder 3= "+ name.indexOf(3));
        int index = name.indexOf('S');
        System.out.println("Index of S': " + index);
	}

}
/* String Length= 19
CAPS= RANGINENI SAIKETHAN
LOWS=rangineni saikethan
Substring (0 to 5): Rangi
Letter at inder 3= -1
Index of S': 10
*/