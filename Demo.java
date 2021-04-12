import java.util.Scanner;
public class Demo{

	public static void main(String[] args){
	
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a number:");
	
	int number= keyboard.nextInt();
	
for (int x =number;x<= 1; x--)
	{
		
	for (int y =x;y<= 1;y--)
	{
		
	
			System.out.print(y);
		
		
	}
		
	System.out.print("  ");
	}
}
}