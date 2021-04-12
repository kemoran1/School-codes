import java.util.Scanner;
public class Patterntwo{

	public static void main(String[] args){
	
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a number:");
	
	    int number= keyboard.nextInt();
	
        for (int x =1; x<= number; x++)
		{

			for (int z = 1; z <= (number-x); z++)
			{
				System.out.print(" ");
			}
	
			for (int y = x; y >= 1; y--)
			{
				System.out.print(y + " ");
				
			}
	
			System.out.println(" ");
			
		}
	}
}