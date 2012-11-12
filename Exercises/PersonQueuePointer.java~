public class PersonQueuePointer implements PersonQueue {
	private Person front;
	
	public PersonQueuePointer() {
		front = null;
	}
	
	public void insert(Person person) {
		if(front == null) {
			front = person;
			return;
		}
		Person aux = front;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(person);
	}
	
	public Person retrieve() {
		if(front == null) {
			return null;
		}
		Person temp = front;
		front = front.getNext();
		return temp;
	}
	
	public boolean empty() {
		if(front == null) {
			return true;
		}
		return false;
	}
}
