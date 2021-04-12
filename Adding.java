import java.util.Scanner;

public class Adding
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
	System.out.print("Number:");
	
	int entry = keyboard.nextInt();
	int total = 0;
	
	for(int x = 1;x <= entry;x++)
	{
		System.out.println(x + " ");
		total = total + x;
	}
	
	{
		System.out.println("Sum: " + total );
	}
	}
}