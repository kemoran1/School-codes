import java.util. Scanner;

public class Money 
{

   public static void main(String[] args)
   {
   
     Scanner keyboard = new Scanner(System.in);   

      System.out.println("Enter number of Mexican Pesos");
	  
	  double money1;
	  money1 = keyboard.nextDouble();
	  money1 = money1 * .544 ;
	  
	  System.out.println("Enter number of Guatemalan Quetzals");
	  
	  double money2;
	  money2 = keyboard.nextDouble();
	  money2 = money2 * 0.1305 ;
	  
	  System.out.println("Enter number of Salvadoran Colóns");
	  
	  double money3;
	  money3 = keyboard.nextDouble();
	  money3 = money3 * 0.1144 ;
	  double total= money1 + money2 + money3;
	  System.out.println("The US currency is " + total );
   }

}