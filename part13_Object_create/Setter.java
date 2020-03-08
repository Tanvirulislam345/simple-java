package part17;
//create a class.
class Frog{
	
	//instance variable
	private String name;
	int age;
	
	//declare set methods
	public void setName(String name) {
		//if we mean private value we have to (use this.)
		this.name = name;
	}
	
	//declare another set methods
	public void setName1(String newName) {
		
		name = newName;
		
	}
	
	//declare a string type methods
	public String getName() {
		
		return name;
	}
	
}

public class Setter {

	public static void main(String[] args) {
		
		//create an object.
		Frog value = new Frog();
		
		/*if declare private variable we cannot use this proccess assign value*/
		//value.name ="karim";
		
		System.out.println(value.getName());	
		
		value.setName1("tanvir");
		System.out.println(value.getName());
		
		
		value.setName("kamal");
		System.out.println(value.getName());

	}

}
