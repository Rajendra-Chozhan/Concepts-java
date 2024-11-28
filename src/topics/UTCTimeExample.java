package topics;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;  
 


public class UTCTimeExample {
	
    public static void main(String[] args) 
	{  
        // print current time  
        System.out.println("IST Time is:"+new Date());  
        // print current UTC time  
        System.out.println("UTC Time is: "+getCurrentUtcTime());  
        
      
        

    	
    }  
    
    
  
		
	

	// create getCurrentUtcTime() method to get the current UTC time  
    public static String getCurrentUtcTime() {  
        // declare and initialize a date variable which we return to the main method  
        String d1;  
        // create an instance of Instant class for getting current UTC time  
        Instant instant = Instant.now();  
        // use toString() method to convert instant object into String  
        d1 = instant.toString();  
        // pass UTC date to main method.  
        return d1;  
    }  
    
  
}
