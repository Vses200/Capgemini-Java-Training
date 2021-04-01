package lab_exercises;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void printPrimeNum(int limit) {
		int res = 0;
		while(limit>res) {
			
			//
			int i=2;
			boolean flag = false;
		    while (i <= res / 2) {
		     
		      if (res % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.print(res + " ");
		    
		    res++;
			//
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the upper limit to find list of prime numbers upto that number : ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		printPrimeNum(limit);
	}

}
