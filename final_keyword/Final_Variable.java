
package final_keyword;

class University{
    //declare final variable
    final String VersityName = "DIU";
   final int fess;//blank final variable(b.f.v)
   static final String name;//static b.f.v
   
   //define constructor for blank final variable
   University(){
       fess = 10000;//initialize value
   }
   //static block use for (s.b.f.v)
   static{
       name = "Tanvirul Islam";//initialize value
   }
   
    
    void result(){
        System.out.println("Name = "+name);
        System.out.println("VersityName = "+VersityName);
        System.out.println("Fess = "+fess);
    }
}
public class Final_Variable {
    public static void main(String[] args) {
        
        //create object
        University u = new University();
        u.result();//calling method
    }
    
}
