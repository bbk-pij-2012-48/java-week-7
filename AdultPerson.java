public class AdultPerson implements Person {
	private int situation;
	private int energy;
	
	public void move(int distance) {
		situation = situation + distance;
	}
	
	public void say(String message) {
		System.out.println(message);
	}
}
	
