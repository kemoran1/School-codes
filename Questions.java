
import java.util.Scanner;

public class Questions
{
   public static void main(String[] args) 
   {

     Scanner keyboard = new Scanner(System.in);
	
	 
	 System.out.println("what is your height in cm?");
	 
	 double height;
	 height = keyboard.nextDouble();
	 
	 height = height*5;
	 System.out.println("your height is" + height);
	 
   }

}