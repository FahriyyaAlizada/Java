package practice_Dec8;

public class Drum extends Instrument{
	@Override
	public void play() {
		System.out.println("Drum is playing: Boom Boom");
	}
	
	@Override
	public String getMaterial() {
		return "Plastic and Leather";
	}
}
