package P1;
import java.util.*;

public class totalMarks {

	public static void main(String[] args) {
		
		System.out.println("Enter Marks for following courses:\n");
		
		System.out.println("English: ");
		Scanner sc = new Scanner(System.in);
		int englishMarks = sc.nextInt();
		
		System.out.println("Java: ");
		int javaMarks = sc.nextInt();
		

		System.out.println("Database: ");
		int dbMarks = sc.nextInt();
		

		System.out.println("Spring Tools: ");
		int sptoolsMarks = sc.nextInt();
		
		int totalMarks= englishMarks+javaMarks+dbMarks+sptoolsMarks;
		double avgMarks= (double)totalMarks/4;
		
		System.out.println("\nTotal Marks : "+totalMarks+"\nAverage Marks : "+avgMarks);
		
	sc.close();	
	}
}
