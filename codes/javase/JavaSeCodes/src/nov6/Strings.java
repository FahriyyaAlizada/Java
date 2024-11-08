package nov6;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		
		// No 1
		String name = "Joe";
		System.out.println("Name => " + name);
		
		// No 2
		String message = "Java dilini öyrənmək maraqlı və faydalıdır.";
		System.out.println("Message => " + message);
		
		// No 3
		System.out.println("Length of message => " + message.length());
		
		// No 4
		System.out.println("The symbol of 7th index => " + message.charAt(7));
		
		// No 5
		System.out.println("The index of symbol n => " + message.indexOf("n"));
		
		// No 6
		System.out.println("Message in Lower Case => " + message.toLowerCase());
		
		// No 7
		System.out.println("Message in Upper Case => " + message.toUpperCase());
		
		// No 8
		if (message.contains("o")) {
			System.out.println("Message contains symbol => o");
		} else {
			System.out.println("Message does not contain symbol => o");
		}
		
		// No 9
		if (message.endsWith(".")) {
			System.out.println("Message ends with symbol => .");
		} else {
			System.out.println("Message does not end with symbol => .");
		}
		
		// No 10
		if (message.startsWith("A")) {
			System.out.println("Message starts with symbol => A");
		} else {
			System.out.println("Message does not start with symbol => A");
		}
		
		// No 11
		String name1 = "     Amy   ";
		
		// No 12
		System.out.println("The name => " + name1.trim());
		
		// No 13
		name1 = "Elizabeth";
		
		// No 14
		System.out.println("First 4 symbols of the name => " + name1.substring(0,4));
		
		// No 15
		name1 = "John Smith";
		
		// No 16
		String[] names = name1.split(" ");
		
		// No 17
		System.out.println("Name and Surname => " + Arrays.toString(names));
	}

}
