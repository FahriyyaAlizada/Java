package practice_Dec29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> originalMap = new LinkedHashMap<String, String>();
		
		originalMap.put("Ad","Aysel");
		originalMap.put("Şəhər","Bakı");
		originalMap.put("Dövlət","Azərbaycan");
		
		LinkedHashMap<String, Integer> keyLengthMap = new LinkedHashMap<String, Integer>();
		
		for (String key : originalMap.keySet()) {
            keyLengthMap.put(key, key.length());
        }
		
		System.out.println("Açarların uzunluqları: " + keyLengthMap);
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(15, "Book");
		map.put(32, "Painting");
		map.put(40, "Lego");
		map.put(26, "Photo");
		
		int mapKey = 32;
		
		if (map.containsKey(mapKey)) {
			map.remove(mapKey);
			System.out.println("Key deleted. New Map: " + map);
		}
		else {
			System.out.println("Key couldn't found.");
		}
        
	}

}
