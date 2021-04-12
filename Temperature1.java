
import java.util. Scanner;

public class Temperature 
{

   public static void main(String[] args)
   {
   
     Scanner keyboard = new Scanner(System.in);   

      System.out.println("Type the degree in Celsius");
	  
	  double temp;
	  temp = keyboard.nextDouble();
	  temp = temp * 9 / 5 + 32;
	  System.out.println("The degree in F is " + temp);
   }

}