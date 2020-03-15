package superKeyword;

//define a class that is super class
class Person{
    //instance variable declare
    int a =34;
    
    //define method
    void display(){
        
        System.out.println(a);
    }
}

//define another class that is sub class
class Teacher extends Person{
    
    int a =67;
    
    @Override
    void display(){
        
        super.display();//calling super class method
        System.out.println(a);
    }
}

public class Super_methods {
    public static void main(String[] args) {
        
        //create object
        Teacher ob = new Teacher();
        ob.display();//calling method
    }
    
}
