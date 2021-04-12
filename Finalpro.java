import java.util. Scanner;

public class Finalpro
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
	System.out.println("Your weight in lbs:");
	double weight = keyboard.nextDouble();
	System.out.println("Number of drinks:");
	int drink= keyboard.nextInt();
	int count = 1;
	int score = 0;
	
	System.out.println("Q1) What are the last 5 letters of the alphabet");
	  
	  System.out.println("   1)ABCED");
	  System.out.println("   2)VXYWZ");
	  System.out.println("   3)VWXYZ");
	  int Question1;
	  Question1 = keyboard.nextInt();
	    
	  if (Question1 == 3)
	  {
	    System.out.println("That's right!");
		score ++;
	  }
	  
	  else
	  {
		  System.out.println("That's wrong");
	  }
	System.out.println("Q2) There are 12 stars on the American Flag");
	  
	  
	  System.out.println("1) yes");
	  System.out.println("2) no");
	  
	  int Question2;
	  Question2 = keyboard.nextInt();

	  if (Question2==1)
	  {
		  System.out.println("That's wrong");
	  }  
	  else
	  {
		  System.out.println("That's correct!");
		  score++;
	  } 
	System.out.println("Q3) What are the 3 digits for Pi?");
	  
	  System.out.println("1) 9.65");
	  
	  System.out.println("2) 3.14");
	  
	  System.out.println("3) 3.42");
	  
	  int Question3;
	  Question3 = keyboard.nextInt();
	  
	  if ( Question3 == 2)
	  {
		  System.out.println(" That's correct!");
		  score++;
	  }
	  else 
	  {
		  System.out.println("That's Wrong! ");
	  }
	
	if (gender == female)
	{
	
		for(int x =1; x == count;x ++)
		{
			
			if (weight <= 160 && drink == 0)
			{
				System.out.println("One more drink until driving skills impaired");
				System.out.println("Safe driving limits");
			}
			if (weight <= 160 && drink == 1)
			{
				System.out.println("Driving skills Impaired. recommended calling a cab or asking a friend to drive");
			}
			if (weight <= 160 && drink >= 2)
			{
				System.out.println("Legally Intoxicated. You may not drive.");
			}	
			if (weight > 160 && drink == 0)
			{
				System.out.println("One drink until driving skills impaired");
				System.out.println("Only safe driving limits");
			}
			if (weight > 160 && drink == 1 )
			{
				System.out.println("Driving skills Impaired");
			}
			if (weight > 160 && drink == 2)
			{
				System.out.println("Driving skills Impaired");
			}	
			if (weight > 160 && drink >= 3)
			{
				System.out.println("Legally Intoxicated");
			}	
		}	
			
	}
	if (gender == male)
	{
		
		for(int y =1; y == count; y ++) 
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
	if(score ==1)
	{
		System.out.println("score:1");
		
	}
	if (score ==2)
	{
		System.out.println("score: 2");
	}
	if (score ==3){
		System.out.println("score: 3");
	}
   }
}