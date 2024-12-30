package dec28;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		
		// TASK 1
		
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Blair");
		map.put("City", "Paris");
		map.put("Country", "France");
		int length = 1;
		String longestKey = "";
		for (String key : map.keySet()) {
			if (key.length()>length) {
				length = key.length();
				longestKey = key;
			}
		}
		System.out.println("Longest key: " + longestKey);
		
		// TASK 2
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("photo1", 27);
		map2.put("photo2", 14);
		map2.put("photo3", 26);
		map2.put("photo4", 11);
		map2.put("photo5", 29);
		int count = 0;
		int sum = 0;
		for (Integer value : map2.values()) {
			count++;
			sum+=value;
		}
		System.out.println("Arithmetic mean: " + sum/count);
	}

}
