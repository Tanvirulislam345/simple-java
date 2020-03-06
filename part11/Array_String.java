package part11;

public class Array_String {
//string type value in array
		public static void main(String[] args) {
			
			//declare string type array
			String[] word = new String[3];
			
			//assign values in array index.
			word[0] = "hello";
			word[1] = "you";
			word[2] = "fine";
			
			System.out.println(word[0]);
			System.out.println(word[1]);
			System.out.println(word[2]);
			
			System.out.println("\n");
			
			//create and assign value in array
			String[] fruits = {"apple","banana","mango","Egg"};
		
			for(String value: fruits)//using for displaying output
			{
				System.out.println(value);
			}
			
			System.out.println("\n");
			
			//create and assign value in array
			String[] values = {"apple","banana","mango","Egg"};
			
			values[0] = "Meat";
			for(String value : values)
			{
				System.out.println( value);
				
			}
			

		}

	}