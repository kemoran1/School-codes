//My work so far

import java.util.Scanner;

public class Gradesarray {

	public static void main(String[] args){
	 Scanner keyboard= new Scanner(System.in);
	 
	 System.out.print("Enter a grade :");
	 int grade=keyboard.nextInt();
	 int[] slot = new int[60];
	 int x=0;
	 int counter=0;
	 int below=0;
	 int above=0;
	while( grade>=0)
	{
	
		slot[x]=grade;
		x++;
		counter++;
		
		if (grade < 65)
		{
			below++;
		}	
		else
		{
			above++;
		}	
		System.out.print("Enter a grade: ");
        grade = keyboard.nextInt();   
	}	
	
	
	System.out.println("Number of Grades =  "+ counter);
	System.out.println("Number of Grades >= "+ below);
	System.out.println("Number of Grades <  "+ above);
}


}