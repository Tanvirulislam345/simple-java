
package superKeyword;
class Ab{
    
    Ab(){
        System.out.println("This is A constructor");
    }
}
class Bc extends Ab{
    
    Bc(){
         super();
        System.out.println("This is B constructor");
    }
}
public class Super_Constructor {
    public static void main(String[] args) {
        
        Bc input = new Bc();
    }
    
}
