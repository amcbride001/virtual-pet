package virtualpet;

public class VirtualPet {

	private int hungerLevel = 76;
	private int hydration = 100;
	private int outside = 88;
	private int goPlay = 45;

	public int getHydration() {
		return hydration;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getOutside() {
		return outside;
	}

	public int getGoPlay() {
		return goPlay;
	}

	public void tick() {
		hydration = hydration - 5;
		hungerLevel += 5;
		outside += 10;
		goPlay -= 8;
	}

	public void outside() {
		hydration -= 42;
	}

	public void water() {
		hydration += 42;
	}

	public void goPlay() {
		goPlay += 15;
	}

	public void feed() {
		hungerLevel += 10;
	}
}
