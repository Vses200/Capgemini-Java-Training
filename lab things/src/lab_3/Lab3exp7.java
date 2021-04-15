package lab_3;
import java.time.*;
import java.util.Scanner;

public class Lab3exp7 {
	public static LocalDate sysDate;
	public static void main(String[] args) {
		
		sysDate = LocalDate.now();
		System.out.println("Enter date in (yyyy-mm-dd) format : " );
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		LocalDate inputDate = LocalDate.parse(inputString);
		
		System.out.println("Years remaining : "+ (  Math.abs(sysDate.getYear()-inputDate.getYear())    ));
		System.out.println("Months remaining : "+ (  Math.abs(sysDate.getMonthValue()-inputDate.getMonthValue())    ));
		System.out.println("Days remaining : "+ (  Math.abs(sysDate.getDayOfMonth()-inputDate.getDayOfMonth())    ));
	}

}
