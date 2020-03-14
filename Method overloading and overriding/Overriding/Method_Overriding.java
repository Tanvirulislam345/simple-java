
package Overriding;

class Person1{
    
       String name;
    int age;
    
    void display(){
        
        System.out.println(name);
        System.out.println(age);
    }
}
    class Teacher1 extends Person1{
        
            String Subject;
   
    
   @Override
    void display(){
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(Subject);
    }
        
    }

public class Method_Overriding {
    
    public static void main(String[] args) {
        
        Teacher1 t1 = new Teacher1();
        t1.Subject = "B.Sc";
        t1.name = "Tanu";
        t1.age = 45;
        t1.display();
    }
    
}
