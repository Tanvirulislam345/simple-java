package leapyear;

import java.util.Scanner;

//define a clss
public class Leapyear {

    int year;//declare instance variable

    //create a method
    void result() {

        System.out.println("Enter your number : ");
        Scanner input = new Scanner(System.in);//taking value by user
        year = input.nextInt();//taking integer type value

        //using if condition for cheak
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year ");
        } else {
            System.out.println("Is not leap year ");
        }
    }

}
