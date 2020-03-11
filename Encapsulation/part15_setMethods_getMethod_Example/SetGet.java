package part15_setMethods_getMethod_Example;

public class SetGet {
	
	//declare private variable
	private String name;
	private int age;
	
	//define set_methods
	public void setName(String name) {
		
		//(this.) use, only when u are using private variable
		this.name = name;
		
	}
	//define set_methods
	public void setAge( int age) {
		
		//(this.) use, only when u are using private variable
		this.age = age;
	}
	
	
	//define get_methods
	public  String getName() {
		
		return name;
	}
	//define get_methods
	public  int getAge() {
		
		return age;
		//System.out.println("Age : "+ age);
	}

}
