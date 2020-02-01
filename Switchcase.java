package application;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the command:");
		String text = input.nextLine();
		
		switch (text) {
		
		case "start":
			System.out.println("This is my matchine");
			break;

		case "close":
			System.out.println("This is not my matchine, it is a book");
			break;
			
		default:
			System.out.println("it is main method");
		}

	}

}
