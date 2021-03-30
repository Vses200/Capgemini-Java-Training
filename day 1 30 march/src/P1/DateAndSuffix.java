package P1;
import java.util.*;

public class DateAndSuffix {
	public static void main(String[] args) {
		
		System.out.println("Enter the day of the month: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		if(day<1 || day>31) {
			System.out.println("Enter a valid date .");
		}
		
		else {
			if(day==1 || day%10==1 && day!=11) {
				System.out.println(day+"st");
			}
			
			else if(day==2 || day%10==2 && day!=12) {
				System.out.println(day+"nd");
			}
			
			else if(day==3 || day%10==3 && day!=13) {
				System.out.println(day+"rd");
			}
			else {
				System.out.println(day+"th");
			}
		}
		sc.close();
		
	}
}
