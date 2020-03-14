package overloading_constructor;

public class Overloading_constructor {
	
	//declare Instance variable
	String name, gender, study;
	int phone;
	
	/* a methods define again and again is called overloading */
	//define constructor methods
	Overloading_constructor(){
		
		System.out.println("This is working");
	}
	
	//define another constructor methods
	Overloading_constructor(String n){
		
	name = n;
	
	}
	
	//define another constructor methods
	Overloading_constructor(String n, String m){
		
	name = n;
	gender = m;
	
	}
	
	//define another constructor methods
	Overloading_constructor(String n, String m, int k){
		
		name = n;
		gender = m;
		phone = k;
		
	}
	
	void display() {
		
		System.out.println("Name : "+name+" Gender : "+gender);
		System.out.println("Name : "+name+" Gender : "+gender +" Phone : "+phone);
		System.out.println("Name : "+name);
	}
	

}
