
package perfect_number;

import java.util.Scanner;

public class Perfect_Number {
    
    int number, sum = 0;
    
    void display(){
        
        System.out.println("Enter your number : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("How many number are divide "+number+" these are :");
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                
                sum = sum + i;
                System.out.print(sum+"  " );
            }
        }
        if (number == sum)
            System.out.println("\nThis is Perfect number because, "+number+" = "+ sum);
       else
            System.out.println("\nThis is not Perfect number");
    }
    
}
