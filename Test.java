 import java.util. Scanner;
 
 public class Test {

   public static void main(String[] args) {

     Scanner keyboard = new Scanner(System.in);
	 
	 
	 int score = 0;
	 
	 System.out.println(" Are you ready for a quiz? ");
	 keyboard.nextLine();
	  
	  
	  System.out.println("Ok, here it comes!");
	  
	  System.out.println("Q1) What is the capital of Alaska");
	  
	  System.out.println("   1)Melbourne");
	  
	  System.out.println("   2)Anchorage");
	  
	  System.out.println("   3)Juneau");
	  
	  int Question1;
	  Question1 = keyboard.nextInt();
	  
	  
	 	  
	  if (Question1 == 3)
	  {
	   
	    System.out.println("That's right!");
		score = score + 1;
	 
	  }
	  
	  else
	  {
		  System.out.println("That's wrong");
		  
	  }
	  
	  System.out.println("Q2) Can you store the value cat in a variable of type int?");
	  
	  
	  System.out.println("1) yes");
	  System.out.println("2) no");
	  
	  int Question2;
	  Question2 = keyboard.nextInt();
	  
	  
	  
	  if (Question2==1)
	  {
		  System.out.println("Thats wrong");
		 
	  }  
	  else
	  {
		  System.out.println("That' correct!");
		  score++;
		  
	  } 
	  System.out.println("Q3) What is the result of 9+6/3?");
	  
	  System.out.println("1) 5");
	  
	  System.out.println("2) 11");
	  
	  System.out.println("3) 15/3");
	  
	  int Question3;
	  Question3 = keyboard.nextInt();
	  
	  if ( Question3 == 2)
	  {
		  System.out.println(" That's correct!");
		  score++;
	  }
	  else 
	  {
		  System.out.println("Thats Wrong! ");
	  }
	 
	 
	 System.out.println("You got this number correct out of three:");
	 System.out.println(score);
   }

}