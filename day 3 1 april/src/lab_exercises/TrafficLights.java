package lab_exercises;
import java.util.*;

public class TrafficLights {
	
	public static void main(String[] args) {
		
		int choice = 0 ;
		String signal[]= new String[]{"Stop","Ready","Go"};
		Scanner sc = new Scanner(System.in);
		
		while(choice!=1111)
		{
		System.out.println("Welcome to Traffic lights simulator\n\n");
		System.out.println("Red = 1\nYellow = 2\nGreen = 3\n");
		System.out.println("Enter the corresponding number to your desired color :");
		
		choice = sc.nextInt();
		
		if(choice<4 && choice>0) {
			System.out.println(signal[choice-1]);
		}
		else {
			System.out.println("Wrong Choice. Please Enter valid value");
		}
		}
	}
}
