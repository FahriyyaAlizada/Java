package dec25;

import java.util.ArrayList;
import java.util.Random;

public class Extra {

	public static void main(String[] args) {
		
		int max = 0;
		int min = 50;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(50));
		}
		System.out.println(list);
		for (Integer integer : list) {
			if (integer>max) {
				max=integer;
			}
			if (integer<min) {
				min=integer;
			}
		}
		System.out.println("Max: " + max + " Min: " + min) ;
		

	}

}
