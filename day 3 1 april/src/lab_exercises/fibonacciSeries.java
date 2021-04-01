package lab_exercises;
import java.util.*;

public class fibonacciSeries {

	public static void fibonacci_UsingLoop(int limit) {
		
		
		int n1=0,n2=1,n3;
		System.out.print("\nUsing loop \n"+n1+" "+n2);
		for(int i=2;i<limit;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		
	}
	static int num1=0,num2=1,num3;
	public static void fibonacci_UsingRecursion(int limit) {
		
		
		
		
		if(limit>0) {
			
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
			fibonacci_UsingRecursion(limit-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the no of series you want to generate: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		fibonacci_UsingLoop(limit);
		System.out.print("\nUsing Recursion \n"+0+" "+1);
		fibonacci_UsingRecursion(limit-2);
		
	}
}
