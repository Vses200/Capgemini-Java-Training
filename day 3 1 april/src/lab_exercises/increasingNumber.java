package lab_exercises;

import java.util.Scanner;

public class increasingNumber {
	
	public static void checkIfIncreasing(int num) {
		int rem,flag=0;
		while(num>0) {
			rem= num%10;
			num=num/10;
			if(num%10>rem) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("It is not an increasing number");
		}
		else
			System.out.println("It is an Increasing number");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to check if a number is an Increasing number or not: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkIfIncreasing(num);
		
	}

}
