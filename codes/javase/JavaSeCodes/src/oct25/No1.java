package oct25;

public class No1 {

	public static void main(String[] args) {
		
		// kod hem massivin elementleri hem de her elementin öz reqemlerini tersine çevirir
		
		int[] numbers = {3361,7821,1254,6009,8911};
		for (int i = numbers.length-1; i > -1; i--) {
			int reverseNum = 0;
			while (numbers[i] != 0) {
				int lastNum = numbers[i] % 10 ;
				reverseNum = reverseNum *10 + lastNum;
				numbers[i] = numbers[i]/10;
			}
			System.out.println(reverseNum);
		}

	}

}
