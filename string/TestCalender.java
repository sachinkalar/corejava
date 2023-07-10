package com.rays.string;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalender {
	
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

	Calendar cal = Calendar.getInstance();
	
	cal.setTime(today);
	for(int i=1;i<12;i++) {
		cal.add(Calendar.DATE, 22);
	
	
	System.out.println(sdf.format(cal.getTime()));

	}

}
}