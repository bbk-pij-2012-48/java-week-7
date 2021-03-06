public class StringListPointer implements StringList {
	private StringNode first;
	
	public void add(String name) {
		StringNode dst = new StringNode(name);
		StringNode aux = first;
		if(aux == null) {
			first = dst;
			return;
		}
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(dst);
	}
	
	public void remove(String name) {
		StringNode aux = first;
		if(aux == null) {
			return;
		}
		if(name.equals(aux.getName())) {
			first = aux.getNext();
			return;
		}
		while(aux.getNext() != null) {
			if(name.equals(aux.getNext().getName())) {
				aux.setNext(aux.getNext().getNext());
				return;
			}
			aux = aux.getNext();
		}
	}
	
	public String[] toArray() {
		if(first == null) {
			return null;
		}
		int count = 1;
		StringNode aux = first;
		while (aux.getNext() != null) {
			aux = aux.getNext();
			count++;
		}
		String[] dst = new String[count];
		aux = first;
		for (int i=0 ; i<count ; i++) {
			dst[i] = aux.getName();
			aux = aux.getNext();
		}
		return dst;
	}
}
		
	
	
			
		
