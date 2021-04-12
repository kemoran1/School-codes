import java.util.Scanner;

public class Pin
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 1124;

		System.out.println("Welcome to Chase Bank");
		System.out.print("ENTER YOUR 4-digit PIN: ");
		int e = keyboard.nextInt();

		while ( e != pin )
		{
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			e = keyboard.nextInt();
		}

		System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}