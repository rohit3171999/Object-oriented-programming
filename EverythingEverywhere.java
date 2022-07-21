
//CodeForces===>Everything Everywhere All But One
import java.util.*;

public class EverythingEverywhere {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int p = 0; p < t; p++) {
			int n = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = s.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = sum + arr[i];
			}
			int count = 0;
			float mean = (float) sum / (float) n;
			for (int i = 0; i < n; i++) {
				if (mean == arr[i]) {
					count++;
					System.out.println("YES");
					break;
				}
			}
			if (count == 0) {
				System.out.println("NO");
			}
		}
	}
}
