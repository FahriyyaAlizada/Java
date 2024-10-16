package oct8;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		
        // int number = 4;
		// int cem = 0;
		// for (int i = 1; i < number; i++) {
		// 	if (number%i==0) {
		// 		cem+=i;
		// 	}
		// 	
		// }
		// if (cem==number) {
		// 	System.out.println("It is perfect number!");
		// } else {
		// 	System.out.println("It is not a perfect number...");
		// }
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
        int num = scanner.nextInt();
        String newNum = "";
        if (num%10==0) {
			num=num/10;
		}
        int reverseNum = 0;
        while (num!=0) {
			int lastNum = num%10;
			//newNum += lastNum;
			reverseNum = reverseNum *10 + lastNum;
			num=num/10;
		}
        System.out.println(reverseNum);

	}

}