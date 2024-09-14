package main;

public class Sep13 {

	public static void main(String[] args) {
		
		// Homework 1
		System.out.println("HOMEWORK 1");
		short shortNum1 = 69;
        byte byteNum1 = (byte) shortNum1;
        System.out.println(shortNum1 + "(short) = " + byteNum1 + "(byte)");
		short shortNum2 = 589;
        byte byteNum2 = (byte) shortNum2;
        System.out.println(shortNum2 + "(short) = " + byteNum2 + "(byte)");
        long longNum1 = 458;
        int intNum1 = (int) longNum1;
        System.out.println(longNum1 + "(long) = " + intNum1 + "(int)");
        long longNum2 = 52523635483L;
        int intNum2 = (int) longNum2;
        System.out.println(longNum2 + "(long) = " + intNum2 + "(int)");
        double doubleNum1 = 5632.6;
        float floatNum1 = (float) doubleNum1;
        System.out.println(doubleNum1 + "(double) = " + floatNum1 + "(float)");
        char charNum1 = 'D';
        int intNum3 = (int) charNum1;
        System.out.println(charNum1 + "(char) = " + intNum3 + "(int)");
        int intNum4 = 123;
        char charNum2 = (char) intNum4;
        System.out.println(intNum4 + "(int) = " + charNum2 + "(char)");
		System.out.println("\n");
        
        // Homework 2
		System.out.println("HOMEWORK 2");
		int int1 = 55;
        byte byte1 = (byte) int1;
        System.out.println(int1 + "(int) = " + byte1 + "(byte)");
		short short1 = 636;
        byte byte2 = (byte) short1;
        System.out.println(short1 + "(short) = " + byte2 + "(byte)");
        long long1 = 458;
        short short2 = (short) long1;
        System.out.println(long1 + "(long) = " + short2 + "(short)");
        long long2 = 92523635483L;
        int int2 = (int) long2;
        System.out.println(long2 + "(long) = " + int2 + "(int)");
        double double1 = 65787.3;
        int int3 = (int) double1;
        System.out.println(double1 + "(double) = " + int3 + "(int)");
        char char1 = 'q';
        int int4 = (int) char1;
        System.out.println(char1 + "(char) = " + int4 + "(int)");
        int int5 = 266;
        char char2 = (char) int5;
        System.out.println(int5 + "(int) = " + char2 + "(char)");
	}
}