package part16_methods_parameters_example;

public class Parameters {

	public static void main(String[] args) {
		
				//create object
				Parameters1 meth1 = new Parameters1();
				Parameters1 meth2 = new Parameters1();
				
				//passing parameters
			meth1.setInformation("Rohima", "B.sc", "female", 1788676753);		
			meth2.setInformation("korima", "B.sc", "female", 1788676753);
			
			
				//calling methods.
				meth1.display();
				meth2.display();

	}

}
