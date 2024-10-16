package oct15;

public class No1 {

	public static void main(String[] args) {
		// int[] array = {12,17,28,31};
		// for (int i = 0; i < array.length; i++) {
		// 	System.out.println(array[i]*2);
		// }
		
		int[] numbers = {4,1,9,7,2};
		int sum = 0;
		int min = 9;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			if (numbers[i]<min) {
				min = numbers[i];
			}
		}
		System.out.println("The sum of the numbers : " + sum);
		System.out.println("The arithmetic mean of the numbers : " + sum/numbers.length);
		System.out.println("The smallest of the numbers : " + min);
		System.out.println("The odd numbers : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2==1) {
				System.out.println(numbers[i]);
			}
		}
	}

}
