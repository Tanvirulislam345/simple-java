package part19_Static_Methods;

public class Static_methods {
	
	//declare Static variable
	static int x = 19;
	
	//define methods
	void display1() {
		System.out.println("result : "+x);
		//display2();//we can use non_static to static
		System.out.println("This is not static methods");
	}
	
	//define Static methods
	static void display2() {
	
		//we can not use static to non_static
		System.out.println("result : "+x);
		System.out.println("This is static methods");
	}

}
