package part18_Constructor_example;

public class Constructor1 {
	
	//declare Instance variable.
	String name, subject, gender;
	int phone;
	
	//define methods with parameters
	Constructor1(String n, String m, String i, int k) {
		
		name = n;
		subject = m;
		gender = i;
		phone = k;
	}
	
	//define another methods
	 void display() {
		
		System.out.println("Name :"+name);
		System.out.println("Subject :"+subject);
		System.out.println("Gender :"+gender);
		System.out.println("Phone :"+phone);
	}

}

