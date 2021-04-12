import java.util.Scanner;

public class Grade
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a grade: ");
	int grade = keyboard.nextInt();
	int x=0;
	int A=0;
	int AM=0;
	int BT =0;
	int B=0;
	int BM=0;
	int CT =0;
	int C=0;
	int CM=0;
	int D=0;
	int F=0;
	
	
    
	while (grade >= 0)
		{
			x++;	
			if ( grade >= 93 && grade <= 100 )
			{
				A++;
			}
			if (grade >= 90 && grade < 93)
			{
				AM++;
			}
			if (grade >= 87 && grade < 90 )
			{
				BT++;
			}	
			if (grade >= 83 && grade < 87)
			{
				B++;
			}
			if (grade >= 80 && grade < 83)
			{
				BM++;
			}
			if (grade >= 77 && grade < 80)
			{
				CT++;
			}
			if (grade >= 73 && grade < 77)
			{
				C++;
			}
			if (grade >= 70 && grade < 73)
			{
				CM++;
			}
			if(grade >= 60 && grade < 70)
			{
				D++;
			}
			if (grade >= 0 && grade < 60)
			{
				F++;
			}
			System.out.println("Enter a grade:");
			grade= keyboard.nextInt();
		}
	{
		System.out.println(" Total number of grades: " + x );
	}
	{
		System.out.println(" Number of A's: " + A);
	}
	{
		System.out.println(" Number of A-'s: " + AM);
	}
	{
		System.out.println(" Number of B+'s: " + BT);
	}
	{
		System.out.println(" Number of B's: " + B);
	}
	{
		System.out.println(" Number of B-'s: " + BM);
	}
	{
		System.out.println(" Number of C+'s: " + CT);
	}
	{
		System.out.println(" Number of C's: " + C);
	}
	{
		System.out.println(" Number of C-'s: " + CM);
	}
	{
		System.out.println(" Number of D's: " + D);
	}
	{
		System.out.println(" Number of F's: " + F);
	}
	
    }
	
}