public class SimpleMapTest {
	public static void main(String[] args) {
		SimpleMap students = new SimpleMapArray();
		if(students.isEmpty())
			System.out.println("Empty");
		students.put(2, "Richard");
		students.put(3, "Fi");
		students.put(5, "Nina");
		System.out.println(students.get(2));
		System.out.println(students.get(3));
		System.out.println(students.get(4));
		System.out.println(students.get(5));
		students.put(5, "Mia");
		System.out.println(students.get(5));
		
		if(students.isEmpty())
			System.out.println("Empty");
		
		students.remove(5);
		System.out.println(students.get(5));
		students.put(5, "Mia");
		System.out.println(students.get(5));
	}
}
