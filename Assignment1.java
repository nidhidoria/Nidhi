import java.util.*;


public class Assignment1 {
	
	static void logout()
	{
		System.out.println("Logging Out");
	}
	static void capture(String img)
	{
		System.out.println("Capturing Image of " +img);
	}
	static int calculateAge(int y)
	{
		int  curryear = 2022;
		int age = curryear- y;
		return age;
	}
	static Date findTodaysDate_Time()
	{
		Date d1 = new Date();
			
		return d1;
		
	}
	public static void main(String[] args) {
		logout();
		capture("moon");
		int a = calculateAge(1992);
		System.out.println("Age is " +a);
		Date s1 = findTodaysDate_Time();
		System.out.println("Today's date is " +s1);
		
	}

}
