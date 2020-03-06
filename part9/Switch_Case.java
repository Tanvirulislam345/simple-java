package part9;

import java.util.Scanner;

public class Switch_Case {
//switch case program.
	public static void main(String[] args) {
		
		//Using Scanner getting input by user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the command:");
		String text = input.nextLine();//taking String type value by user
		
		//using switch case statement
		switch(text) {
		
		case "start":
			System.out.println("Strt my matchine ");
			break;

		case "close":
			System.out.println("Close my matchine");
			break;
			
		default:
			System.out.println("You write rong thing");
		}

		

	}

}
