package lab_3;
import java.util.*;
public class Lab3exp1 {
	
	
	
	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("enter numbers separated with space");
		Scanner sc = new Scanner(System.in);
		StringTokenizer numbers = new StringTokenizer(sc.nextLine()," ");
		System.out.println("The numbers are : ");
		  while (numbers.hasMoreTokens()) {
			  	String s = numbers.nextToken();
		         System.out.print(s+" ");
		         sum+= Integer.parseInt(s);
		     } 
		System.out.println("sum = "+sum);
	}

}
