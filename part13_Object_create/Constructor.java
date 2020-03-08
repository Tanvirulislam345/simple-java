package part18;
//create a class
class Machine{
	
	//declare instance private variable
	private String name;
	private int age;
	
	//declare constructor methods
	public Machine() {
		name = "anni";
		System.out.println("it is working ");
	
	}
	
	//declare constructor methods
	public Machine(String name) {
		
		this(name, 45);//if we want this method can use for last methods
		
		System.out.println("it is again working ");
	
	}
	
	public Machine(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println(name + " age : "+ age);
		
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		//create object with parameter
		Machine mach =new Machine();
		//new Machine();//we can also use this proccess
		
		Machine mach1 = new Machine("tanu");
		
		Machine mach2 = new Machine("kamal", 34);

	}

}
