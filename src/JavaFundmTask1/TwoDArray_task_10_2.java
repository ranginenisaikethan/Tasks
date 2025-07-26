package JavaFundmTask1;

public class TwoDArray_task_10_2 {

	public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},  //1
		            {4, 5, 6},  //2
		            {7, 8, 9}}; //3
		        for (int  i= 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++)
		                System.out.print(matrix[i][j] + " ");
		            System.out.println("----------original");
		        }
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++)
		                System.out.print(matrix[j][i] + " "); // GIVes transpose 
		            System.out.println("----------transpose");
		        }
		    }
		}
/* Original Matrix:
1 2 3 ----------original
4 5 6 ----------original
7 8 9 ----------original
1 4 7 ----------transpose
2 5 8 ----------transpose
3 6 9 ----------transpose
*/
