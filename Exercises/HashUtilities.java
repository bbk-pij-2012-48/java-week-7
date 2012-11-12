public class HashUtilities {
	
	public static int shortHash(int src) {
		return (Math.abs(src))%1000;
	}
}
