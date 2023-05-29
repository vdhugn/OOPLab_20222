package newJavaProject;
import java.util.Scanner;
public class plus2Matrices {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.println("Input matrix row");
		int m = keyb.nextInt();
		System.out.println("Input matrix column");
		int n = keyb.nextInt();
		
		int matrix1[][] = new int[m][n];
		int matrix2[][] = new int[m][n];
		int matrix_sum[][] = new int[m][n];
		
		int c,d;
		System.out.println("Input the first matrix elements");
		for (c=0; c<m; c++) {
			for (d=0; d<n; d++) {
				matrix1[c][d] = keyb.nextInt();
			}
		}
		System.out.println("Input the second matrix elements");
		for (c=0; c<m; c++) {
			for (d=0; d<n; d++) {
				matrix2[c][d] = keyb.nextInt();
			}
		}
		for (c=0; c<m; c++) {
			for (d=0; d<n; d++) {
				matrix_sum[c][d] = matrix1[c][d] + matrix2[c][d];
				System.out.print(matrix_sum[c][d] + "  ");
			}System.out.println();
		}
	}
}
