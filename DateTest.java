import java.util.*;
public class DateTest{
	
public static void main(String []args)
{
	int mon,day,yr;
	Scanner inputs =new Scanner(System.in);
	Date d1,d2=new Date();
	System.out.println("Enter the month day and year for first date");
	mon=inputs.nextInt();
	day=inputs.nextInt();
	yr=inputs.nextInt();
	//Initialization using constructor
		d1=new Date(mon,day,yr);
	//Initialization using get and set methods
	System.out.println("Enter the month day and year for second date");
	mon=inputs.nextInt();
	day=inputs.nextInt();
	yr=inputs.nextInt();	
	d2.setDay(day);
	d2.setMonth(mon);
	d2.setYear(yr);
	//Display using get method
	System.out.println("First Date:");
	d1.displayDate();
	System.out.println("Second Date:");
	d2.displayDate();
	
}
}
