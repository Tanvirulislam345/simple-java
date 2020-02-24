package simpleJava;

public class Part11Array2 {
//print string type value
	public static void main(String[] args) {
		
		String[] word = new String[3];
		
		word[0] = "hello";
		word[1] = "you";
		word[2] = "fine";
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		System.out.println(word[2]);
		
		System.out.println("\n");
		
		String[] fruits = {"apple","banana","mango","Egg"};
		for(String fruit: fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("\n");
		
		
		String[] values = {"apple","banana","mango","Egg"};
		
		values[0] = "Meat";
		for(String value : values)
		{
			System.out.println( value);
			
		}
		

	}

}
