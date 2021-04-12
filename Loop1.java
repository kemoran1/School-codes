import java.util.Scanner;

public class Loop1
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
	
	int x; 
        for (x = 1; x <= 30; x++)
		{
			System.out.println(x + " ");
			if (x % 2== 0 && x % 3 !=0)
			{
				System.out.println("Number is even");
			}
			
			
			if (x %3==0)
			{
				System.out.println("Number is odd");
				System.out.println("Number is divisible by 3");
				
			}
			if (x % 5 ==0)
			{
				System.out.println("Number is divisible by 5");
			}
			if (x % 7== 0)
			{
				System.out.println("Number is divisible by 7");
				
			}	
			if (x % 9 ==0)
			{
				System.out.println("Number is divisible by 9");
			}
				
		}
    }
}