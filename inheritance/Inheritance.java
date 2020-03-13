package Private_inheritance;

//define a class
 class Person1{
     
        int a;//declare Instance variable
        
        //define constructor
        Person1(int x){
            a = x;
        }
        
        //define methods
        public int nothing(){
            return a*a;
        }
        
    }
    
  class Teacher1 extends Person1{
        int b;
        Teacher1(int x, int y){
           super(x); 
            b = y;
        }
        
         public int something(){
            return a*b ;
        }
    }

public class Inheritance {

    public static void main(String[] args) {
         
         //Create object with constructor parameters 
         Teacher1 t1 = new Teacher1(3, 7);
         System.out.println("RESULT : " +t1.something());
        
    }
    

    
}
