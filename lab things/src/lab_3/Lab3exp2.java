package lab_3;
import java.util.*;

public class Lab3exp2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuffer str=new StringBuffer(sc.nextLine());
		
		getImage(str);
	}

	

	public static void getImage(StringBuffer strbuff) {
		System.out.println(strbuff+"|"+strbuff.reverse());
		
	}
}
