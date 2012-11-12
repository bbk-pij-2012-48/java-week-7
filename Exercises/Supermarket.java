public class Supermarket {
	private PersonQueue checkout;		// How can I use the interface PersonQueue here, and still use the extra method empty()?
	
	public Supermarket() {
		checkout = new PersonQueuePointer();
	}
	
	public static void main(String[] args) {
		Supermarket script = new Supermarket();
		script.launch();
	}
	
	public void launch() {
		Person newCustomer = new Person("Dave");
		addPerson(newCustomer);
		newCustomer = new Person("Steve");
		addPerson(newCustomer);
		newCustomer = new Person("Alan");
		addPerson(newCustomer);
		servePerson();
		servePerson();
		newCustomer = new Person("Mike");
		addPerson(newCustomer);
		newCustomer = new Person("Richard");
		addPerson(newCustomer);
		newCustomer = new Person("Fi");
		addPerson(newCustomer);
		newCustomer = new Person("Nina");
		addPerson(newCustomer);
		servePerson();
		servePerson();
		servePerson();
		servePerson();
		servePerson();
		servePerson();
		servePerson();
		servePerson();				
	}
	
	public void addPerson(Person person) {
		checkout.insert(person);
		System.out.println(person.getName() + " has joined the queue");		
	}
	
	public boolean servePerson() {
		if(((PersonQueuePointer)checkout).empty()) {  			// Cast the more general 'checkout' to more specific type PersonQueuePointer to use additional methods not defined in interface
			System.out.println("No-one left to serve");
			return false;
		}
		System.out.println(checkout.retrieve().getName() + " has been served");
		return true;
	}
}
		
