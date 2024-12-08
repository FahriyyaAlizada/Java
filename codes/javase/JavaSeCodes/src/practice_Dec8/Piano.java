package practice_Dec8;

public class Piano extends Instrument {

	@Override
	public void play() {
		System.out.println("Piano is playing: Do Re Mi");
	}
	
	@Override
	public String getMaterial() {
		return "Wood and Steel";
	}

}
