package lab_exercises;

import java.util.*;

public class Main_classDivisibleBy3or5 {
	
	public static void main(String[] args) {
		
	
	System.out.println("Enter the upper limit to find sum of numbers either divisible by 3 or 5");
	Scanner sc = new Scanner(System.in);
	int limit = sc.nextInt();
	
	classDivisibleBy3or5 c= new classDivisibleBy3or5(limit);
	c.calculate();
	
	System.out.println("Result = "+c.sum);
	
	
	}
}
