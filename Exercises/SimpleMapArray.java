public class SimpleMapArray implements SimpleMap {
	
	private String[] stringArray = new String[1000];
	private int elts = 0;
	
	public void put(int key, String name) {
		if(stringArray[key] != null) {
			return;
		}
		stringArray[key] = name;
		elts++;
	}
	
	public String get(int key) {
		return stringArray[key];
	}
	
	public void remove(int key) {
		if(stringArray[key] == null) {
			return;
		}
		stringArray[key] = null;
		elts--;
	}
	
	public boolean isEmpty() {
		return elts == 0;
	}
}
