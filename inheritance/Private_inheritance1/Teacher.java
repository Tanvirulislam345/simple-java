package Private_inheritance;

//define a class
public class Teacher extends Person {

    //declare private variable
    private String quali;

     //define set & get methods
    public void setQuali(String quali) {
        this.quali = quali;
    }

    public String getQuali() {
        return quali;
    }

}
