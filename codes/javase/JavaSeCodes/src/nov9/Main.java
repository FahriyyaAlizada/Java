package nov9;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// EXERCISE 1
		String[] array = new String[5];
		array[0] = "Hi";
		array[1] = "I";
		array[2] = "am";
		array[3] = "Jackson";
		array[4] = "Walker";
		String sentence = "";
		for (int i = 0; i < array.length; i++) {
			sentence = sentence.concat(array[i] + " ");
		}
		System.out.println(sentence);
		
		// EXERCISE 2
		System.out.println(Other.endsWithChecker(sentence, "er "));
		
		// EXERCISE 3
		Random random = new Random();
		int randomNum = random.nextInt(21)+10;
		System.out.println(randomNum);
		
		// EXERCISE 4
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your full name => "); 
		String fullName = scanner.nextLine();
		fullName.trim();
		String[] strArray = fullName.split(" ");
		int count = strArray.length;
		int symbols = fullName.length()-(count-1);
		System.out.println("Symbols in the full name: " + symbols);

	}

}
