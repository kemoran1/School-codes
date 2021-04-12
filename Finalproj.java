import java.util. Scanner;

public class Finalproj
{

   public static void main(String[] args)
   {
   
    Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("Enter your gender: ");
	System.out.println("1) male");
	System.out.println("2) female");
	int gender = keyboard.nextInt();
	int male = 1;
	int female = 2;
	System.out.println("Your weight in lbs");
	double weight = keyboard.nextDouble();
	System.out.println("Number of drinks:");
	int drink= keyboard.nextInt();
	
	//male  First column
	if (gender == male  && weight < 100 &&  drink == 0)
	{
		System.out.println("1 One drink until  driving skills impaired");
		System.out.println("2 Only safe driving limits");
	}
	if (gender == male  && weight < 100 && drink == 1)
	{
		System.out.println("3 Driving Skills Impaired");
	}
	if (gender == male  && weight < 100 && drink >= 2 )
	{
		System.out.println("4 Legally Intoxicated");
	}
	
	// male second column
	if (gender == male && weight >= 100 && weight <= 140 && drink == 0 )
	{
		System.out.println("5 Only safe driving limits");
	}
	if (gender == male && weight >= 100 && weight <= 140 && drink == 1 )
	{
		System.out.println("6 Driving Skills Impaired");
	}
	if (gender == male && weight >= 100 && weight <= 140 && drink >= 2 )
	{
		System.out.println("7 Legally Intoxicated");
	}
	// male thrid column
	
	if (gender == male && weight >= 140 && weight <= 160 && drink == 0 )
	{
		System.out.println("8 Only safe driving limits");
	}
	if (gender == male && weight >= 140 && weight <= 160 && drink == 1 )
	{
		System.out.println("9 Driving Skills Impaired");
	}
	if (gender == male && weight >= 140 && weight <= 160 && drink >= 2 )
	{
		System.out.println("10 Legally Intoxicated");
	}
	
	//male forth column
	if (gender == male && weight >= 160 && weight <= 180 && drink == 0 )
	{
		System.out.println("11 Only safe driving limits");
	}
	if (gender == male && weight >= 160 && weight <= 180 && drink == 1 && drink == 2 )
	{
		System.out.println("12 Driving Skills Impaired");
	}
	if (gender == male && weight >= 160 && weight <= 180 && drink >= 3 )
	{
		System.out.println("13 Legally Intoxicated");
	}
	
	// male fifth column
	if (gender == male && weight >= 180 && weight <= 220 && drink == 0)
	{
		System.out.println("14 Only safe driving limits");
	}	
	if (gender == male && weight >= 180 && weight <= 220 && drink == 1 && drink == 2) 
	{
		System.out.println("15 Driving Skills Impaired");
	}	
	if (gender == male && weight >= 180 && weight <= 220 && drink >= 3)
	{
		System.out.println("16 Legally Intoxicated");
	}
	// male seven column
	
	if (gender == male && weight >= 220 && weight <= 240 && drink == 0)
	{
		System.out.println("17 Only safe driving limits");
	}
	if (gender == male && weight >= 220 && weight <= 240 && drink == 1 && drink == 2)
	{
		System.out.println("18 Driving Skills Impaired");
	}
	if (gender == male && weight >= 220 && weight <= 240 && drink >= 3)
	{
		System.out.println("19 Legally Intoxicated");
	}
	// male last column
	if (gender == male && weight > 240  && drink == 0)
	{
		System.out.println("20 Only safe driving limits");
	}
	if (gender == male && weight > 240 && drink == 1 || drink == 2 || drink  == 3)
	{
		System.out.println("21 Driving Skills Impaired");
	}
	if (gender == male && weight > 240 && drink >= 3)
	{
		System.out.println("22 Legally Intoxicated");
	}
	    //female first column through fourth column
   
    if (gender == female && weight <= 160 && drink == 0)
    {
        System.out.println("One drink until driving skills impaired");
        System.out.println("Only safe driving limits");
    }
    
    if (gender == female && weight <= 160 && drink == 1)
    {
        System.out.println("Driving Skills Impaired");
    }
    
    if (gender == female && weight <= 160 && drink >= 2)
    {
        System.out.println("Legally Intoxicated");
    }

    //female fifth column through eighth column
    
    if (gender == female && weight > 160 && weight <= 240 && drink == 0)
    {
        System.out.println("One drink until driving skills impaired");
        System.out.println("Only safe driving limits");
    }

    if (gender == female && weight > 160 && weight <= 240 && drink == 1 || drink == 2)
    {
        System.out.println("Driving skills Impaired");
    }

    if (gender == female && weight > 160 && weight <= 240 && drink >= 3)
    {
        System.out.println("Legally Intoxicated");
    }

   }

}