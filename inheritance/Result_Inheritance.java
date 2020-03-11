package inheritance;

public class Result_Inheritance {

	public static void main(String[] args) {
		
		//create object 
		Person pe1 = new Person();
		
		pe1.age = 24;
		pe1.name ="akash";
		
		//calling methods
		pe1.display();
	
		//create object
		Teacher te1 = new Teacher();
		
		//assign values
		te1.age = 33;
		te1.name = "I am tanvirul";
		te1.subject = "B.Sc in CSE";
		
		//calling methods
		te1.display1();
		
		

	}

}
