package part10;

public class Simple_Array {
//Declare and print array values.
	public static void main(String[] args) {
		
		//Declare array
		int[] number;
		number = new int[3];
		
		System.out.println(number[0]);
		
		//assign values in array index.
		number[0] = 12;
		number[1] = 13;
		number[2] = 14;
		
		System.out.println("The array list is:");
		
		/***
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
		**/
		
		//using for loop
		for(int i = 0; i < number.length; i++)
		{
			System.out.println(number[i]);
		}
		
		System.out.println("\n");
		System.out.println("Displaying all values:");
		
		//create and assign value in array
		int[] values = { 2, 5, 8};
		for(int i = 0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
	}
}