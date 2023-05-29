package newJavaProject;
import java.util.*;
public class reverseArray {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number of elements");
		int m = kb.nextInt();
		int myArr[] = new int[m];
		System.out.println("Input your number");
		int i, sum = 0;
		double avg;
		for (i=0; i<m; i++) {
			myArr[i] = kb.nextInt();
		}
//		String myStr = Arrays.toString(myArr);
		Arrays.sort(myArr);
		System.out.println(Arrays.toString(myArr));
		for (i=0; i<m; i++) {
			sum = sum + myArr[i];
		}
		avg = sum/m;
		System.out.println(
				"The sum of the given array: " + sum);
		System.out.println(
				"The average value of the given array: " + avg);
	}
}
