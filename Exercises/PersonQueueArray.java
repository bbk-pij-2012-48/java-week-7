public class PersonQueueArray implements PersonQueue {
	private Person[] personArray;
	private int front;
	private int size;
	
	public PersonQueueArray() {
		personArray = new Person[5];
		front = 0;
		size = 0;
	}
	
	public void insert(Person person) {
		if(nearlyFull()) {
			grow();
		}
		size++;
		personArray[front+size-1] = person;
	}
	
	public Person retrieve() {
		if(size == 0) {
			return null;
		}
		Person next = personArray[front];
		front++;
		size--;
		return next;
	}
	
	private boolean nearlyFull() {
		if(personArray.length == front+size) {
			return true;
		}
		return false;
	}
	
	private void grow() {
		Person[] biggerArray = new Person[2*personArray.length];
		for (int i=front ; i<front+size ; i++) {
			biggerArray[i] = personArray[i];
		}
		this.personArray = biggerArray;
	}
}
	
