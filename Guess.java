import java.util.Scanner;

public class Guess
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int answer = 58;

		System.out.println("I have choosen a number between 1 and 100. You have 7 guesses");
		System.out.println("First guess:");
		int guess = keyboard.nextInt();
		int counter = 1; 

		while ( guess != 58 && counter <=6 )
		{
			counter++;
			if (guess < 58 && counter <= 6 ){
				System.out.println("Sorry, you are too low");
			}
			else if (guess > 58 && counter <= 6  ){
				System.out.println ("Sorry, you are too high");
			}
			System.out.println("Guess #" +counter +":");
			guess=keyboard.nextInt();
			
		if (guess == 58)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		if (counter > 6)	
		{
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		}

}
	
		

	}
}