package part19_Static_variable;

public class Student1 {
	
	//declare static variable
	static int count = 0;
	
	//define constructor
	Student1(){
		
		count++;
	}

	//define methods
	void display() {
		
		System.out.println("Total Student : "+count);
	}
}
