package part16;
class Robot{
	
	//declare void type method
	void speak(){
		
		System.out.println("Hello");
	}
	
	//declare another methods with parameters 
	 void talk(String text) {
		System.out.println(text);
	}
	 
	//declare another methods with parameters 
		 void jump(int value) {
			System.out.println("My name is tanvirul Islam \ni am "+value+"years old");
		}
		 
			//declare another methods with parameters 
		 void call(String value, double value1) {
			System.out.println("My name is "+value+ "\ni am "+value1+"years old");
		}
}

public class Method_Parameters {

	public static void main(String[] args) {
	
		//create an object name sam.
		Robot sam = new Robot();
		
		sam.speak();//calling a methods
		sam.talk("I want to be a very good enginner");//calling another methods
		sam.jump(23);//calling another methods
		sam.call("tanvirul Islam", 23);//calling another methods
		
		String greeting = "Hello there.";
		
		sam.talk(greeting);
	}

}
