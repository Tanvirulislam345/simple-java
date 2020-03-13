
package Private_inheritance;

//define a class
public class Teacher extends Person{
    
private  String quali;

    public void setQuali(String quali) {
        this.quali = quali;
    }
    
    public String getQuali() {
        return quali;
    }
    
    void display(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQuali());
    }
   
}
