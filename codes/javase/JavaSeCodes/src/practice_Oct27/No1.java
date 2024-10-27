package practice_Oct27;

import java.util.Arrays;

public class No1 {

	public static void main(String[] args) {
		
//			EXERCISE 1
//		int [] num = {23,78,11,95,46};
//		System.out.println(max(num));
//	}
//	public static int max(int[] array) {
//		int maxi = array[0];
//		for (int i : array) {
//			if (i>maxi) {
//				maxi=i;
//			}
//		}
//		return maxi;
		
		
//			EXERCISE 2		
//		int [] num = {-4, 12, 37, -64, -18, 50, -23};
//		for (int i = 0; i < num.length; i++) {
//			if (num[i]<0) {
//				num[i] *= -1;
//			}
//		}
//		System.out.println(Arrays.toString(num));
		
		
//			EXERCISE 3	
//		int [] num = {2,5,1,2,8,9,2,3};
//		System.out.println("The number of 2 is: " + findNum2(num));
//		}
//		
//		public static int findNum2(int[] array) {
//			int count = 0;
//			for (int i : array) {
//				if (i==2) {
//					count++;
//				}
//			}
//			return count;

		
//			EXERCISE 4
		int [][] num = {{1,5,6},{2,7,8}};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = num[i][j] + sum;
			}
		}
		System.out.println(sum);
	}	
}