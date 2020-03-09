package part19_Static_variable;

public class Test_Student {

	public static void main(String[] args) {
	
		//create object with initialize
		Student sam = new Student("tanvir",34);
		
		//calling methods
		sam.display();
		
		System.out.println(Student.uName);

	}

}
