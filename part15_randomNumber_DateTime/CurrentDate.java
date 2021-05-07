
package BasicJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    
    public static void main(String[] args) {
        
	//This is simple way find date and time
        //using LoclDateTime and now methods find time or date
        LocalDateTime time = LocalDateTime.now();
//         LocalDateTime date = LocalDateTime.now();

	//use format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//         DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy:mm:ss");
	
	//current date and time
        String currentDate = formatter1.format(date);
//         String currentTime = formatter2.format(time);

	//print
        System.out.println("Current Date is - " + currentDate);
//         System.out.println("Current time is - " + currentTime);
        //create date class object
        Date date = new Date();
        //System.out.println("Todays date is : "+date);

// 	This is another way find date
//      using DateFormat and SimpleDateFormat methods
//      DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss"); //use for date and time 
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        String currentdate = dateformat.format(date);

        System.out.println("Todays date is : " + currentdate);


    }
    
}
