package overloading_constructor;

public class Test_Overloading {

	public static void main(String[] args) {
		
		//create object and initialize value
		Overloading_constructor sam = new Overloading_constructor();
		Overloading_constructor sam1 = new Overloading_constructor("tanvir");
		Overloading_constructor sam2 = new Overloading_constructor("tanvir", "male");
		Overloading_constructor sam3 = new Overloading_constructor("tanvir", "male", 1234);

		//calling methods
		sam.display();
		sam1.display();
		sam2.display();
		sam3.display();
	}

}
