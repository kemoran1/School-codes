import java.util.Scanner;

public class Guessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int answer = 6;

		System.out.println("I have choosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess:");
		int guess = keyboard.nextInt();

		while ( guess != 6 )
		{
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			guess=keyboard.nextInt();
		}

		System.out.println("That's right! You're a good guesser!");
	}
}