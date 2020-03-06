package path15;

class Person{
	
	//Declare Instance variable
	String name;
	int years;
	
	//declare a void type methods
	void speak() {
		
		System.out.println("My name is "+ name);
	}
	
	//declare return type another (get_method)methods
	int value() {
		 
		int age = 89 - years;
		System.out.println("Age = "+age);
		return age;
	}
	
	//declare return type another (get_method)String methods
	int getAge() {
		
		return years;
	}
	
	//declare return type another methods
	String getName() {
		
		return name;
	}
}

public class Getters_and_Return_Values {

	public static void main(String[] args) {
		//create person1 
		Person person1 = new Person();
		
		person1.name = "tanvir";
		person1.years = 23;
		
		//calling methods
		person1.speak();
		person1.value();
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		

	}

}
