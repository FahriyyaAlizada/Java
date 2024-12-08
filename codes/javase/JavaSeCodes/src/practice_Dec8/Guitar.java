package practice_Dec8;

public class Guitar extends Instrument{
	@Override
	public void play() {
		System.out.println("Guitar is playing: Strum Strum");
	}
	
	@Override
	public String getMaterial() {
		return "Wood and Nylon";
	}
}
