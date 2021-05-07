
package BasicJava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentTime {
    public static void main(String[] args) {

	//this is simple way find date and time.
        //using LoclDateTime and now methods find time or date
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.now();

	//use format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy:mm:ss");
	
	//current date and time
        String currentDate = formatter1.format(date);
        String currentTime = formatter2.format(time);

	//print
        System.out.println("Current Date is - " + currentDate);
        System.out.println("Current time is - " + currentTime);

        
        //using LoclTime and now methods
        LocalTime time = LocalTime.now();
        //System.out.println("Current time is - "+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currenttime = formatter.format(time);
        //String currenttime = formatter.format(time);
        
        System.out.println("Current time is - "+currenttime);


    }
        
    }
    
}
