import java.util.Scanner;

public class Star {

    public static void main(String[]args) {
	
	System.out.print("Enter a number:");
	
	Scanner keyboard = new Scanner(System.in);
	
	int number = keyboard.nextInt();
	
	for (int x = 0; x < number; x++)
	{
		for (int y = 0; y <= x; y++)
		{
			System.out.print("*");
		}
	System.out.println(" ");
	}
	
	
	}
}
	