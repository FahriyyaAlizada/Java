package dec28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
		
		// TASK => 04.01.2025
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(5);
        Map<Integer,Integer> listMap = new LinkedHashMap<Integer, Integer>();
        for (Integer integer : list) {
			if (listMap.containsKey(integer)) {
				int count2 = listMap.get(integer);
				count2++;
				listMap.replace(integer, count2);
			} else {
				listMap.put(integer, 1);

			}
		}
        for (Integer key : listMap.keySet()) {
			if (listMap.get(key)>1) {
				System.out.println(key);
			}
		}
		
		
	}

}
