public class StringNode {
	private String name;
	private StringNode next;
	
	public StringNode(String name) {
		this.name = name;
		next = null;
	}
	
	public StringNode getNext() {
		return next;
	}
	
	public void setNext(StringNode src) {
		next = src;
	}
	
	public String getName() {
		return name;
	}
}
