package part15_setMethods_getMethod_Example;

public class SetGet {
	
	//declare private variable
	private String name;
	private int age;
	
	//define set_methods
	public void setName(String name) {
		
		this.name = name;
		
	}
	//define set_methods
	public void setAge( int age) {
		
		this.age = age;
	}
	
	
	//define getmethods
	public  String getName() {
		
		return name;
	}
	//define getmethods
	public  int getAge() {
		
		return age;
		//System.out.println("Age : "+ age);
	}

}
