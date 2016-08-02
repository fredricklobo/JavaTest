package pkg;

import java.util.Calendar;

public class DifferenceInDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
	
		c1.set(2015, 8, 22);
		c2.set(2016, 8, 22);
		
		long milli1 =c1.getTimeInMillis();
		long milli2 = c2.getTimeInMillis();
		
		long diff = milli2-milli1;
		
		long diffInDays = diff/(24*60*60*1000);
		System.out.println("Difference days "+diffInDays+ ".");
				}

}
