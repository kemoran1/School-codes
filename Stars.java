import java.util.Scanner;

public class Stars {

    public static void main(String[]args) {

        Scanner userInput = new Scanner(System.in);
		
        System.out.print("Enter a number: ");	
	
        int num = userInput.nextInt();
	
        
	
        for (int x = 0; x < num; x++) {
		
            for (int y = 0; y <= x; y++) {
			
                System.out.print("*");
				
            }
			
            System.out.println(" ");

        }
    }
}