package topics;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

//import org.json.simple.parser.ParseException;

public class ConvertUTC {
	
	public static void main(String args[]){
		
		
	
		String inputValue = "2024-08-15T22:56:02.038Z";
	    Instant timestamp = Instant.parse(inputValue);
	    ZonedDateTime losAngelesTime = timestamp.atZone(ZoneId.of("Asia/Kolkata"));
	    System.out.println(losAngelesTime);

}}
