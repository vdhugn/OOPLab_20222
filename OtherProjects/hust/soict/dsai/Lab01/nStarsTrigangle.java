package newJavaProject;
import java.util.Scanner;

public class nStarsTrigangle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = kb.nextInt();
		
		int i,j;
		for (i=1; i<=n; i++) {
			for (j=2*(n-i); j>=0; j--) {
				System.out.print(" ");
			}for (j=1; j<=i; j++) {
				System.out.print("* ");
			}for (j=2; j<=i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}
