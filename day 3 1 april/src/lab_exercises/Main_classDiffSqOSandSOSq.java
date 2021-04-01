package lab_exercises;

import java.util.Scanner;

public class Main_classDiffSqOSandSOSq {
	public static void main(String[] args) {
		
		System.out.println("Enter the upper limit to find difference between sum of squares and square of sum :");
		Scanner sc = new Scanner(System.in);
		int limit= sc.nextInt();
		
		classDiffSqOSandSOSq diff = new classDiffSqOSandSOSq(limit);
		diff.findDifference();
	}

}
