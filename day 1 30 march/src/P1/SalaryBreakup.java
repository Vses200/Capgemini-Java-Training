package P1;
import java.util.*;

public class SalaryBreakup {
	public static void main(String[] args) {
		
		System.out.println("Enter the basic salary:\n");
		
		Scanner sc = new Scanner(System.in);
		double bSalary = sc.nextInt();
		
		double hra =(double) 0.4 * bSalary;
		double da = (double)0.6 * (bSalary+hra);
		double totalSalary = bSalary+hra+da;
		double tax = 0;
		
		
		if(totalSalary<200000.0){
			tax = 0;	
		}
		
		else if(200000<totalSalary && totalSalary<600000) {
			tax =(double) 0.1 * totalSalary;
		}
		
		else if(totalSalary>600000) {
			tax= (double)0.2 * totalSalary;		
		}
		
		System.out.println("\nHRA :"+hra+"\nDA : "+da+"\nTax : "+tax);
		System.out.println("\nTakeaway Salary : "+(totalSalary-tax));
		
		
	}

}
