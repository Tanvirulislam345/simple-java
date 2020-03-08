package part14_methods_example;

public class Mathods {

	public static void main(String[] args) {
		
		//create object
		Methods1 meth1 = new Methods1();
		Methods1 meth2 = new Methods1();
		
		meth1.name = "rojina";
		meth1.subject = "B.sc";
		meth1.gender = "Female";
		meth1.phone = 123455667;
		
		//calling methods.
		meth1.display();
		System.out.println("\n");
		meth2.name = "Morjina";
		meth2.subject = "B.sc";
		meth2.gender = "Female";
		meth2.phone = 123455667;
		
		//calling methods.
		meth2.display();
		

	}

}
