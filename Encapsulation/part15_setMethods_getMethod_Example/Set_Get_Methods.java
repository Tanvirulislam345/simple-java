package part15_setMethods_getMethod_Example;

public class Set_Get_Methods {

	public static void main(String[] args) {
	
		//create object
		SetGet sam = new SetGet();
		
		//passing value
		sam.setName("tanvir");
		sam.setAge(22);
		
		System.out.println("Name : " + sam.getName());
		System.out.println("Age : " + sam.getAge());
		//sam.getAge();

	}

}
