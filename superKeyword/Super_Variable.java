
package superKeyword;

//define a class(this is super class)
 class A{
    int x = 10;   
}

//inherit class(this is sub class)
class B extends A{
    int x = 50;
    
    //define a method
    void display(){
        System.out.println(x);
        //System.out.println(super.x);//calling super variable
    }
}
public class Super_Variable {
    public static void main(String[] args) {
        
        //create object
        B di = new B();
        di.display();//calling methods
    }
    
}
