/**
* Basic list of Strings
*/
public interface StringList {
	/**
	* Adds a new String to the end of the list
	*/
	void add(String input);
	
	/**
	* Removes a String from the list which matches by name
	*/
	void remove(String name);
	
	/**
	* Returns an array of Strings containing each elt in the list
	*/
	String[] toArray();
}
