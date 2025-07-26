package JavaFundmTask1;
public class Keyword {
    public static void main(String[] args) {
        int count = 5;
        boolean quest = true;
        byte byteNum = 16;
        short shortNum = 1458;
        long longNum = 145216L;
        float pi = 3.14f;
        double onlye = 2.718;
        String result1 = "", result2 = "";
        if (byteNum > count) {
            result1 = "smallNum is greater";
        } else {
            result1 = "count is greater";
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Result1: " + result1);
        }
        System.out.println("Is today's session will be fun? " + quest);
        {
        	if(longNum == shortNum) {
        		result2 = "both are equal";
        	}
        	else {
        		result2= "both are not equal";
        	}
        	System.out.println("Result2" + result2);
        }
        System.out.println("Value of Pi: "+pi);
    }
}

/* task 4.2
public class KeywordExample {
public static void main(String[] args) {
    int class = 5;   // ❌ Illegal!
    System.out.println(class);
}
}

ERROR: Keyword.java:3: error: not a statement
        int class = 5;

*/