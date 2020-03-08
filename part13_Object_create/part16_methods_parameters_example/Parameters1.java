package part16_methods_parameters_example;

public class Parameters1 {
	
	//declare Instance variable.
	String name, subject, gender;
	int phone;
	
	//define methods with parameters
	void setInformation(String n, String m, String i, int k) {
		
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

