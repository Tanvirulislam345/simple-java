package part18_Constructor_example;

public class Constructor {

	public static void main(String[] args) {
		
		//create and initialige object
		Constructor1 sam = new Constructor1("Rohima", "B.sc", "female", 1788676753);
		Constructor1 sam1 = new Constructor1("korima", "B.sc", "female", 1788676753);
		
		//calling methods
		sam.display();
		System.out.println("\n");
		sam1.display();
		
	}

}
