package Oct1;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		numbers[0]=6;
		numbers[1]=1;
		numbers[2]=5;
		numbers[3]=2;
		int min = numbers[0];
		int max = numbers[0];
		int sum=0;
		for (int i : numbers) {
			// tapşırıq 3
			if (i<min) {
				min=i;
			}
			
			if (i>max) {
				max=i;
			}
			// tapşırıq 4
			if (i%2==1) {
				System.out.println(i);
			}
			
			if (i%2==0) {
				System.out.println(i);
			}

			sum+=i;
		}
		System.out.println(min);
		System.out.println(max);
		// tapşırıq 1
		System.out.println(sum);
		// tapşırıq 2
		System.out.println(sum/numbers.length);
		
	}

}
