import java.util. Scanner;

public class Bmi 
{

   public static void main(String[] args)
   {
   
     Scanner keyboard = new Scanner(System.in);   

      System.out.println("Your height in m");
	  
	  double mass;
	  mass = keyboard.nextDouble();

	  
	  System.out.println("Your weight in kg");
	  
	  double weight;
	  weight = keyboard.nextDouble();
	  
	  
	  double bmi;
	  bmi = weight / (mass * mass) ;
	  System.out.println("Your BMI is  " +  bmi);
	  
	  if (bmi < 18.5)
	  {
		  System.out.println(" BMI category: Underweight");
	  }
	  else if (bmi >= 18.5 &&  bmi <= 24.9)
	  {
		  
		 System.out.println("BMI Category: Normal weight");
	  }
	  else if (bmi >= 25.0 && bmi <= 29.9)
	  {
		  System.out.println("BMI Category: Overweight");
	  }		  
	  else if (bmi > 30.0)
	  {
		  System.out.println("BMI Category: Obese");
	  }
	  
	  
   }

}