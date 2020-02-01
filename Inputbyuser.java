package application;

import java.util.Scanner;

public class Inputbyuser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The line:");
		String line = input.nextLine();
		
		System.out.println("Enter a number:");
		int value = input.nextInt();
		
		System.out.println("The line is:"+line);
		System.out.println("roll:"+value);

	}

}
