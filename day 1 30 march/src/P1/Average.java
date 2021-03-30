package P1;

import java.util.*;

public class Average {
	public static void main(String[] args) {
		
		System.out.println("How many numbers you want to find average of?\n");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int number_array[]= new int[num];
		int sum=0;
		double average= 0.0;
		
		System.out.println("Enter the numbers one by one:\n");
		for(int i=0;i<num;i++) {
			sc = new Scanner(System.in);
			number_array[i]=sc.nextInt();
			sum += number_array[i];
		}
		average = (double)sum/num;
		System.out.println("The average of  ");
		
		for(int i=0;i<num;i++) {
			System.out.println(number_array[i]+"\t");
			
		}
		
		System.out.println("\n"+average);
		sc.close();
		
	}

}
