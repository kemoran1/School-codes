import java.util.Scanner;

public class Add
{
    public static void main( String[] args )
    {
		 Scanner keyboard = new Scanner(System.in);
	System.out.println ("I will add up the numbers you give me");
	System.out.println("Number: ");
	int entry1 = keyboard.nextInt();
	 
		
		while(entry != 0)
		{
			entry= entry1 + entry2;
			System.out.println("Total so far is " + entry);
			System.out.println("Number: ");
			entry2=keyboard.nextInt();
		}
	}
}