public class HashTest {
	public static void main (String[] args){
		System.out.println("Enter string: ");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println(hash + " maps to " + smallHash);
	}
}
