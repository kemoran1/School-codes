public class Grades {

    public static void main(String[] args) {
        
        int A = 0;
        int A_minus = 0;
        int B_plus = 0;
        int B = 0;
        int B_minus = 0;
        int C_plus = 0;
        int C = 0;
        int C_minus = 0;
        int D = 0;
        int F = 0;
        
        int total = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a grade: ");
        int grade = in.nextInt();
        
        while (grade != -1)
        {
            
            total++;
            
            if (grade >= 93 && grade <= 100)
                A++;
                
            else if (grade >= 90 && grade < 93)
                A_minus++;
            
            else if (grade >= 87 && grade < 90)
                B_plus++;
                
            else if (grade >= 83 && grade < 87)
                B++;
            
            else if (grade >= 80 && grade < 83)
                B_minus++;
                
            else if (grade >= 77 && grade < 80)
                C_plus++;
            
            else if (grade >= 73 && grade < 77)
                C++;
                
            else if (grade >= 70 && grade < 73)
                C_minus++;
                
            else if (grade >= 60 && grade < 70)
                D++;
                
            else if (grade >= 0 && grade < 60)
                F++;
                
            System.out.println("Enter a grade: ");
            grade = in.nextInt();   
                
        }
        
        System.out.println("Total number of grades = " + total);
        System.out.println("Number of A's  = " + A);
        System.out.println("Number of A-'s = " + A_minus);
        System.out.println("Number of B+'s = " + B_plus);
        System.out.println("Number of B's  = " + B);
        System.out.println("Number of B-'s = " + B_minus);
        System.out.println("Number of C+'s = " + C_plus);
        System.out.println("Number of C's  = " + C);
        System.out.println("Number of C-'s = " + C_minus);
        System.out.println("Number of D's  = " + D);
        System.out.println("Number of F's  = " + F);
        
    }
}

