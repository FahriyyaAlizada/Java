package oct18;

import java.util.Arrays;
import java.util.ArrayList;
// import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		// String[] colors = new String[4];
		// for (int i = 0; i < colors.length; i++) {
		// 	Scanner scanner = new Scanner(System.in);
		// 	String color = scanner.nextLine();
		// 	colors[i]=color;
		// }
		// for (String string : colors) {
		// 	System.out.println(string);
		// }
		
		// int[] num = {2,6,4,9,1,7,5,3};
		// int[] num2 = Arrays.copyOf(num,4);
		// System.out.println(Arrays.toString(num2));
		
		int[] numbers = {26,17,48,35};
		int sum = 0;
		int max = 0;
		int min = 1000000000;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+1 + ") " + numbers[i]);
		} System.out.println("\n");
		
		for (int i : numbers) {
			if (i>max) {
				max=i;
			}
			if (i<min) {
				min=i;
			}
			sum+=i;
			System.out.println("=> " + i); 
		} System.out.println("\n");

		System.out.println("The mean of the numbers: " + sum/numbers.length); 
		System.out.println("\n");
		
		System.out.println("Max => " + max + "; Min => " + min); 
		System.out.println("\n");
		
		ArrayList<Integer> oddNums = new ArrayList<>();
		ArrayList<Integer> evenNums = new ArrayList<>();
		for (int i : numbers) {
			if (i%2==0) {
				evenNums.add(i);
			} else {
				oddNums.add(i);
			}
		}
		System.out.println("Odd numbers => " + oddNums.toString());
		System.out.println("Even numbers => " + evenNums.toString());
		System.out.println("\n");
		
		ArrayList<Integer> primeNums = new ArrayList<>();
		for (int i : numbers) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==2) {
				primeNums.add(i);
			}
		}
		System.out.println("Prime numbers => " + primeNums.toString());
		System.out.println("\n");
		
		Arrays.sort(numbers);
		for (int i = numbers.length-1; i > -1; i--) {
			System.out.println(numbers[i]);
		}
	}

}
