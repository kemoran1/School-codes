import java.util.Scanner;
public class Patternone{

	public static void main(String[] args){
	
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a number:");
	
	int number= keyboard.nextInt();
for (int x =1;x<= number; x++)
	{
	for (int y =1;y<= x;y++)
	{
		System.out.print(y);
	}
	System.out.println(" ");
	}
	
	}

}