package simpleJava;

//create a class and using some data
class Person{
	/*
	*class can contain 2 thing.
	*
	 1. field (data item)
	 2. methods/subroutines(function)
	 
	*****/
	
	
	//declaring Instance variable
	
	String name;
	int age;
	
}

public class Part13Classes1 {

	public static void main(String[] args) {
		
		
		//create  Person1,2,3 object using person class
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		
		//assign some value in person data type(person is object) .
		person1.name = "Tanvirul Islam";
		person1.age = 22;
		
		person2.name = "Hasibul Islam";
		person2.age = 22;
		
		person3.name = "Soniya Islam";
		person3.age = 22;
		
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person3.name);
		System.out.println(person3.age);
	

	}

}
