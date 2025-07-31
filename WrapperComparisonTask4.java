package wrapper_classes_task5;

public class WrapperComparisonTask4 {
    public static void main(String[] args) {
        Integer a = 100;         
        Integer b = 100;        
        Integer c = new Integer(100); 

        System.out.println(a == b);    
        System.out.println(a == c);    
        System.out.println(a.equals(c)); 
    }
}


/* Task 4: Comparing Wrapper Objects
Objective: Understand how wrapper objects behave with == and .equals().
Task:
 Create two Integer objects with same value using:
o Auto boxing
o new Integer(100)
 Compare using == and .equals() and explain the difference

*/