// Three Doors====> CodeForces Contest 1709

import java.util.*;
public class Solution {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while (k-- > 0) {
			int x = sc.nextInt();
			int[] nums = new int[3];
			for(int i=0; i<3; i++)
				nums[i] = sc.nextInt();

			Set<Integer> st = new HashSet<>();

			for(int i=0; i<3; i++) {
				if(x > 0) {
					st.add(x);
					x = nums[x-1];
				}
			}
			if(st.size() == 3)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}