package simpleJava;

class people {
	/*
	 * class can contain 2 thing.
	 *
	 * 1. field (data item) 2. methods/subroutines(function)
	 * 
	 *****/

	// declaring Instance variable

	String name;
	int age;

	// creating a methods using loop.
	void speaK() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " And i am " + age + " years old");

		}
	}
	void sayMan() {
		System.out.println("Hello man");
	}

}

public class Part14Methods2 {

	public static void main(String[] args) {

		// create Person1,2,3 object using person class
		people person1 = new people();
		people person2 = new people();
		people person3 = new people();

		// assign some value in person data type(person is object) .
		person1.name = "Tanvirul Islam";
		person1.age = 22;

		person3.name = "Soniya Islam";
		person3.age = 22;
		
		person2.name = "Hasibul Islam";
		person2.age = 22;

		System.out.println(person1.name);
		person1.speaK();
		System.out.print("\n");
		person1.sayMan();
	
	}

}
