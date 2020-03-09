package part19_Static_block;

public class StaticBlock {
	
	//declare static variable
	static String name;
	static int id;
	
	//static block use for initialize
	static {
		
		name = "tanvir";
		id = 12;
	}
	
	//define static methods
	static void display() {
		
		System.out.println("name : "+name);
		System.out.println("id : "+id);
		
	}

}
