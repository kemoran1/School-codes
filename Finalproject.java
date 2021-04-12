import java.util.Scanner;
public class Finalproject
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter your gender: ");
	System.out.println("1) male");
	System.out.println("2) female");
	System.out.println(" ");
	int gender = keyboard.nextInt();
	int male = 1;
	int female = 2;
	System.out.println("Your weight in lbs: ");
	double weight = keyboard.nextDouble();
	System.out.println("Number of beers:");
	int drink = keyboard.nextInt();
	int count = 1;

	System.out.println("Enter the beer you drank: ");
	System.out.println("1) Corona");
	System.out.println("2) Bud light");
	System.out.println("3) Blue Moon");
	System.out.println("4) Heineken");
	System.out.println("5) Coor's light");
	System.out.println(" ");
            int beer = keyboard.nextInt();
            int corona = 1;
            int bud_light = 2;
            int blue_moon = 3;
            int heineken = 4;
            int coors_light = 5;

    if (beer == corona)
    {
    	System.out.println("Percentage of alcohol: " + 4.5 * drink + "%");
    }
    if (beer == bud_light)
    {
    	System.out.println("Percentage of alcohol: " + 4.2 * drink + "%");
    }
    if (beer == blue_moon)
    {
    	System.out.println("Percentage of alcohol: " + 5.4 * drink + "%");
    }
    if (beer == heineken)
    {
    	System.out.println("Percentage of alcohol: " + 5.0 * drink + "%");
    }
    if (beer == coors_light)
    {
    	System.out.println("Percentage of alcohol: " + 4.2 * drink + "%");
    }
	if (gender == female)
	{
		for(int x = 1; x == count; x++)
		{
			if (weight <= 160 && drink == 0)
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}
			if (weight <= 160 && drink == 1)
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight <= 160 && drink >= 2)
			{
				System.out.println("Legally Intoxicated");
			}	
			if (weight > 160 && weight <= 240 && drink == 0)
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}
			if (weight > 160 && weight <= 240 && drink == 1 )
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight > 160 && weight <= 240 && drink == 2)
			{
				System.out.println("Driving skills Impaired");
			}	
			if (weight > 160 && weight <= 240 && drink >= 3)
			{
				System.out.println("Legally Intoxicated");
			}	
		}	
			
	}
	if (gender == male)
	{
		for(int y = 1; y == count; y ++) 
		{	
			if ( weight < 140 && drink == 0 )
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}
			if ( weight < 140 && drink == 1 )
			{
				System.out.println("Driving skills Impaired");
			}
			if ( weight < 140 && drink >= 2 )
			{
				System.out.println("Legally Intoxicated");
			}
			if (weight >= 140 && weight <= 240 && drink == 0 )
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}
			if (weight >= 140 && weight <= 240 && drink == 1 )
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight >= 140 && weight <= 240 && drink == 2 )
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight >= 140 && weight <= 240 && drink >= 3 )
			{
				System.out.println("Legally Intoxicated");
			}
			if (weight > 240 && drink == 0)
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}	
			if (weight > 240 && drink == 1)
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight > 240 && drink == 2)
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight > 240 && drink == 3)
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight > 240 && drink >= 4)
			{
				System.out.println("Legally Intoxicated");
			}
		}
	}
   }
}