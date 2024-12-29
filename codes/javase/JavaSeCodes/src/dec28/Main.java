package dec28;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Apple", 3);
		map.put("Banana", 5);
		map.put("Cherry", 10);
		
		System.out.println(map);
		
		map.put("Apple", 5);
		
		System.out.println(map);

	}

}