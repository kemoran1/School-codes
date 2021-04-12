 import java.util. Scanner;
 
 public class Age {

   public static void main(String[] args) {

     Scanner keyboard = new Scanner(System.in);
	 
	 System.out.println("What is your name? ");
	 
	  
	  String name;
	  name = keyboard.nextLine();
	  
	  
	  System.out.println("Ok, "+ name + " how old are?");
	  
	  double age;
	  age = keyboard.nextDouble();
	  
	 	  
	  if (age < 16)
	  {
	   
	   System.out.println("You can't drive");
	  
	  }
	  if (age < 18 )
	  {
	  
	  System.out.println("You can't vote");
	  
	  
	  }
	  if (age < 25)
	  {
	  
	  System.out.println("You can't rent a car");
	  
	  
	  }
	  if (age >= 25)
	  {
	  System.out.println("You can do anything thats legal");
	  }

	  
   }

}