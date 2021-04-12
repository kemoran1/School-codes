 import java.util. Scanner;
 
 public class Years {

	public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter month:");  
	int m;
	m = keyboard.nextInt();
	System.out.println("Enter day:");
	int d;
	d = keyboard.nextInt();
	System.out.println("Enter year:");
	int y;
	y = keyboard.nextInt();
	
	  if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1000 || y > 9999)
	  {
		  System.out.println("Invalid entry.");
	  }
	  else 
	  {
		  System.out.println("Valid entry.");
	  }
	  
	  if (y % 4==0 && y % 100!= 0 || y % 400 ==0 )
	  {
          System.out.println(m + "/" + d + "/" + y + " falls on a leap year");
      }
	  
	  
	  else
	  {
		  System.out.println(m + "/" + d + "/" + y + " is not a leap year");
		  
	  }
	  
   }

}