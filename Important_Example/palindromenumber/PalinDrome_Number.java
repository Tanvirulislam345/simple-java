
package palindromenumber;
import java.util.Scanner;

public class PalinDrome_Number {
    
    //instance variable
    String original, reverse = "";
    
    //define methods
    void display(){
        
        System.out.println("Enter a Line : ");
        Scanner input = new Scanner(System.in);
        original = input.nextLine();
        
        for(int i = original.length() - 1; i >= 0; i--){
            
            reverse = reverse + original.charAt(i);
            
        }
        
        if(original.equals(reverse))
            System.out.println("This is Palindrome number, because "+original+" = "+reverse);
        else
            System.out.println("This is not palindrome number because "+original+" != "+reverse);
    }
    
}
