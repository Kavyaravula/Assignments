package MyAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {

	public static void main(String[] args) {
		
		Date d= new Date();
		
		System.out.println(d);
		
		String date= new SimpleDateFormat("yyyy-MMM-dd-hh-mm-ss").format(d);
		System.out.println(date);
	
		

	}

}
