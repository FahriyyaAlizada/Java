package dec18;

public class Operations {
	
	public int divide(int a, int b) {
		if (b==0) {
			throw new Exception("Number can not be divided into 0...");
		}
		return a/b;
	}
	
	public char getCharacter(String str,int index) {
		if (index>=str.length()) {
			throw new Exception("Index is out of characters...");
		}
		char result = str.charAt(index);
		return result;
	}
	
}
