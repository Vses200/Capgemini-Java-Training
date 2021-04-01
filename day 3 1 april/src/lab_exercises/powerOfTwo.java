package lab_exercises;

import java.util.Scanner;

public class powerOfTwo {

	public static void checkIfPowerofTwo(int num) {
		
		if(num==0) {
			System.out.println("Enter a non zero number");	
		}
		else {
			if((Math.ceil((Math.log(num)/Math.log(2))))==(Math.floor((Math.log(num)/Math.log(2))))){
				System.out.println("It is power of 2");
			}
			else
				System.out.println("It is not power of 2");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a number to find if it is a power of 2 or not :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		 checkIfPowerofTwo(num); 	}
	
}
