package palindromenumber;

import java.util.Scanner;

public class Palindrome_int_number {

    int number, rnumber;

    void displayInt() {

        System.out.println("Enter a number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while(number > 0){

            rnumber = number % 10;
            System.out.print(rnumber);
            number = number / 10;
        }
      
    }

}
