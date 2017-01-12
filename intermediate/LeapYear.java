
public class LeapYear {

	public static void main(String[] args) {
		
		LeapYear ly = new LeapYear();
		
		System.out.println("2008 is a leap year: " + ly.returnIfLeapYear(2008));
		System.out.println("2009 is a leap year: " + ly.returnIfLeapYear(2009));
		System.out.println("2010 is a leap year: " + ly.returnIfLeapYear(2010));
		System.out.println("2011 is a leap year: " + ly.returnIfLeapYear(2011));
		System.out.println("2012 is a leap year: " + ly.returnIfLeapYear(2012));
		System.out.println("2013 is a leap year: " + ly.returnIfLeapYear(2013));
		System.out.println("2014 is a leap year: " + ly.returnIfLeapYear(2014));
		System.out.println("2015 is a leap year: " + ly.returnIfLeapYear(2015));
		System.out.println("2016 is a leap year: " + ly.returnIfLeapYear(2016));

	}
	
	
	public Boolean returnIfLeapYear(int year){
		
		boolean isLeapYear = false;
		
		if (year % 4 == 0){
			if(year % 400 == 0 || year % 100 != 0)
				isLeapYear = true;
		}
		
		return isLeapYear;
	}

}
