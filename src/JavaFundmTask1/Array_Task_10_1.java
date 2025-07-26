package JavaFundmTask1;

import java.util.Scanner;

public class Array_Task_10_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		double avg = 0;
		int min, max, sum=0;
		
		System.out.println("Enter 10 numbers to calculate:");
		for(int i=0; i<10;i++) {
			arr[i]=sc.nextInt();
			sum +=arr[i];
			avg = (sum/10);         //1
		}
		min = max = arr[0];
		for (int i=0; i<10;i++) {
			if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
		}
		System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
	}

}

/* Enter 10 numbers to calculate:
4
5
545
54
54
54
5458
54
547
5475
Sum = 12250
Average = 1225.0
Max = 5475
Min = 4
*/
