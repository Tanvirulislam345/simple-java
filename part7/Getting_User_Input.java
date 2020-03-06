package part7;

import java.util.Scanner;

public class Getting_User_Input {
//Getting User input.(taking value by user)
	
	public static void main(String[] args) {
	
		//Declare Scanner getting input by user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The line:");
		//nextLine() use for taking String line values
		String line = input.nextLine();
		
		System.out.println("Enter a number:");
		//nextInt() use for taking integer values
		int value = input.nextInt();
		
		System.out.println("The name is "+line);
		System.out.println("roll:"+value);


	}

}
