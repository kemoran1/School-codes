import java.util. Scanner;

public class Quadratic 
{

   public static void main(String[] args)
   {
   
     Scanner keyboard = new Scanner(System.in);   

      System.out.println("Enter a: ");
	  
	  double a;
	  a = keyboard.nextDouble();

	  
	  System.out.println("Enter b: ");
	  
	  double b;
	  b = keyboard.nextDouble();
	  
	  
	  
	  
	  System.out.println("Enter c: ");
	  
	  double c;
	  c = keyboard.nextDouble();
	  
	  double formula;
	  formula = (-b + (Math.sqrt((b*b)-4 * a * c)))/ 2* a;
	  
	  
	  
	  System.out.println("Root 1 is  " +  formula);
	  
	  double formula2;
	  formula2 = (-b - (Math.sqrt((b*b)-4 * a * c)))/2 *a;
	  
	  System.out.println("Root 2 is " +  formula2);
	  
   }

}