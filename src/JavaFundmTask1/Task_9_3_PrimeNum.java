package JavaFundmTask1;

public class Task_9_3_PrimeNum
{
    public static void main(String[] args) 
    {
        for (int i = 2; i <= 10; i++) 
        {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) 
            {
                if (i % j == 0) 
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(i);
        }
    }
}
