package dec21;

import java.util.ArrayList;
import java.util.Random;

public class ListClass {

	public static void main(String[] args) {
		
		// TASK 1
		Random random = new Random();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 40; i++) {
			int x = random.nextInt(90)+10;
			if (x%2==0) {
				list1.add(x);
			}
			else {
				i--;
			}
		}
		System.out.println(list1);
		
		System.out.println(" ");
		
		// TASK 2
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		
		list2.add("Last");
		list2.add("Christmas");
		list2.add("I");
		list2.add("gave");
		list2.add("you");
		list2.add("my");
		list2.add("heart");
		list2.add("But");
		list2.add("the");
		list2.add("very");
		list2.add("next");
		list2.add("day");
		list2.add("you");
		list2.add("gave");
		list2.add("it");
		list2.add("away");
		
		System.out.println(list2);
		
		for (int i = list2.size()-1; i > -1; i--) {
			list3.add(list2.get(i));
		} 
		
		System.out.println(list3);
		
		
		
		System.out.println("\r\n"
				+ ".__                                                                                   ._.\r\n"
				+ "|  |__ _____  ______ ______ ___.__.   ____   ______  _  __  ___.__. ____ _____ _______| |\r\n"
				+ "|  |  \\\\__  \\ \\____ \\\\____ <   |  |  /    \\_/ __ \\ \\/ \\/ / <   |  |/ __ \\\\__  \\\\_  __ \\ |\r\n"
				+ "|   Y  \\/ __ \\|  |_> >  |_> >___  | |   |  \\  ___/\\     /   \\___  \\  ___/ / __ \\|  | \\/\\|\r\n"
				+ "|___|  (____  /   __/|   __// ____| |___|  /\\___  >\\/\\_/    / ____|\\___  >____  /__|   __\r\n"
				+ "     \\/     \\/|__|   |__|   \\/           \\/     \\/          \\/         \\/     \\/       \\/\r\n"
				+ "");
	}

}
