package main;
import java.util.Scanner;
class Sep17 {

	public static void main(String[] args) {
		
//		int count = 6;
//		int count2 = count++; //7 // post incerement
//		System.out.println(count); //7
//		System.out.println(count2); //6
//		
//		int countt = 5;
//		int countt2 = ++countt; // pre incerement
//		System.out.println(countt); //6
//		System.out.println(countt2); //6
//		
//		int counttt = 7;
//		int counttt2 = --counttt; // pre decrement
//		// post decrement counttt--
//		System.out.println(counttt); //6
//		System.out.println(counttt2); //6
//		
//		int a = 4;
//		int b = 8;
//		int c = ++a - --b % b-- * a;
//		System.out.println(c); //5
		
		// Homework 1
		System.out.println("HOMEWORK 1");
		for(int i=1; i<6; i++) {
	        System.out.println(i); } //tapşırıq 1

		  Scanner input = new Scanner(System.in);
		  int number1 = input.nextInt();
		  int number2 = input.nextInt();
		  System.out.println("sum: " + number1 + number2 + "multiplication: " + number1 * number2); //tapşırır 2 ve 3
		  

		  int radius = input.nextInt();
		  double pi = 3.14159265358979323846;
		  System.out.println(radius * 2 * pi); //tapşırıq 4
		  
		  int num = input.nextInt();
		  int sum = 0;
	        while(num!=0) {
	            int son=num%10;
	            sum = sum + son;
	            num = num /10;
	        }
	        System.out.println(sum); //tapşırıq 5
	       
	      int num2 = input.nextInt();
	      int bolen = 0;
	        for (int i=1; i<num2 +1; i++) {
	            if(num2%i == 0) {
	                bolen++;
	            }}
	        if(bolen==2) {
	            System.out.println("sade ededdir");
	        }
	        else {
	            System.out.println("sade eded deyildir");
	        } // tapşırıq 6
	        
	        int cem = 0;
	        for(int i=1; i<101;i++) 
	        {
	            cem=cem+i;
	        }
	        System.out.println(cem); //tapşırıq 7
	        
	        for(int i=1; i<101;i++) 
	        {
	            if(i%7==0) {
	                System.out.println(i);
	            }
	        } //tapşırıq 8
	        
	        int eded = input.nextInt();
	        if(eded % 2 == 0) {
                System.out.println("cut ededdir");
            }
            else {
                System.out.println("tek ededdir");
            } //tapşırıq 9
	        
	        for(int i=1; i<201;i++) 
	        {
	            if(i%7==0 && i%3==0) {
	                System.out.println(i);
	            }
	        } // tapşırıq 10
	        
            int say = 0;
            int sayi = 1;
            while (say<20) {
	           sayi++;
	           int bolen = 0;
	           for (int i=1; i<sayi+1; i++) {
	            if(sayi%i == 0) {
	                bolen++;
	            }}
	           if(bolen == 2) {
	               System.out.println(sayi);
	               say++;
	           }
	       } // tapşırıq 11
           
    		System.out.println("\n");
    		
    	// Homework 2
    	System.out.println("HOMEWORK 2");	
    	
    	for(int i=50; i>19; i--) {
            System.out.println(i);
        } // tapşırıq 1
    	
    	for (int d = 0; d < 51; d++) {
            double i = d / 10.0; 
            System.out.println(i);
        } // tapşırıq 2
    	
    	int maxNum = input.nextInt();
    	int max = 0;
        while(maxNum!=0) {
            int son=maxNum%10;
            if (son>max)  {
                max=son;
            }
            maxNum = maxNum /10;
        }
        System.out.println(max); //tapşırıq 3
        
        int minNum = input.nextInt();
    	int min = 9;
        while(minNum!=0) {
            int son=minNum%10;
            if (son<min)  {
                min=son;
            }
            minNum = minNum /10;
        }
        System.out.println(min); //tapşırıq 4
        
		System.out.println("\n");
		
		// Homework 3
	  	System.out.println("HOMEWORK 3");
	  	
	  	for(int i=15; i<41; i++) {
            System.out.println(i);
        } // tapşırıq 1
	  	
	  	for(int i=20; i<51; i++) {
            if(i%2!=0) {
                System.out.println(i);
            }
        } // tapşırıq 2
	}

}