
package superKeyword;

public class Cars extends Vehicle{
    
     //declare Instance variable
    int gear;
    
     //define constructor
    Cars(String n, double m, int k){
        super(n, m);//calling constructor using super
        gear = k;
    }
    
    //define a method
    @Override
    void result(){
        
        super.result();//calling method using super
        System.out.println("Gear : "+gear);
    }
}