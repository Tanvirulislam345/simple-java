
package Overriding;

public class Teacher extends Person {
    
    String Subject;
   
    
   @Override
    void display(){
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(Subject);
    }
    
}
   
