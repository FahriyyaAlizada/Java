package practice_Dec22;

import java.util.ArrayList;
import java.util.Random;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		int length = 0;
		String str = "";
		list.add("Happy");
		list.add("New");
		list.add("New");
		list.add("Year");
		list.add("!");
		for (String string : list) {
			if (string.length()>length) {
				length = string.length();
				str = string;
			}
		}
		System.out.println(list);
		System.out.println(str);
		
		/////////////////////////////////////////////////
		
		Random random = new Random();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list2.add(random.nextInt(100));
		}
		System.out.println(list2);

	}

}
