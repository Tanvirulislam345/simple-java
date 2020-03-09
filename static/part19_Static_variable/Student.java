package part19_Static_variable;

public class Student {
	
	//declare Instance variable
	String name;
	int id;
	
	//declare static variable
	static String uName = "Diu";
	
	Student(String n, int m){
		
		name = n;
		id = m;
				
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("UniversityName : "+uName);
	}

}
