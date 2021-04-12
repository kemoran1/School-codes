import java.util. Scanner;
 
 public class Test {

   public static void main(String[] args) {

     Scanner keyboard = new Scanner(System.in);
	 
	 
	 int score = 0;
	 
	 System.out.println(" Are you ready for a quiz? ");
	 keyboard.nextLine();
	  
	  
	  System.out.println("Ok, here it comes!");
	  
	  System.out.println("Q1) What are the last 5 letters of the alphabet");
	  
	  System.out.println("   1)ABCED");
	  
	  System.out.println("   2)VXYWZ");
	  
	  System.out.println("   3)VWXYZ");
	  
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
	  
	  System.out.println("Q2) There are 12 stars on the American Flag");
	  
	  
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
	  System.out.println("Q3) What are the 3 digits for Pi?");
	  
	  System.out.println("1) 9.65");
	  
	  System.out.println("2) 3.14");
	  
	  System.out.println("3) 342");
	  
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