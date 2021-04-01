package lab_exercises;
import java.util.*;

public class SumOfCubes {

	public static int sum_ofCubes(int num) {
		int res=0;
		
		while(num>0)
		{
			int rem = num%10;
			res+= rem*rem*rem;
			num/=10;
		}
		
		return res;
	}
	 
	public static void main(String[] args) {
		
		System.out.println("==============Program to find sum of cubes of digits of a number=================\n\n");
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("\nThe Sum of Cubes of "+number+" = "+sum_ofCubes(number));
		
		
	}
}
