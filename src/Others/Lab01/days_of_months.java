package newJavaProject;
import java.util.Scanner;
public class days_of_months {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the month: ");
		String month = kb.nextLine();
		
		System.out.println("Enter the year: ");
		int year = kb.nextInt();
		
		String Feb = "February Feb. Feb 2";
		String month30 = "April Apr. Apr 4 June Jun. Jun 6 September Sep. 9 November Nov. Nov 11";
		
		if (Feb.contains(month)) {
			if (year%4==0 || year%400==0 && year%100!=0) {
				System.out.println(29);
			}else {
				System.out.println(28);
			}
		}else {
			if (month30.contains(month)) {
				System.out.println(30);
			}else {
				System.out.println(31);
			}
		}
	}
}
