class FunctionTest1
{
	static void logOut()
	{
		System.out.println("Logging Out..");
	}

	static void gotoLocation(int x,int y)
	{
		System.out.println("going to loaction "+x+","+y);
	}

	static float multiply(int x,int y)//formal arguments
	{
		float multiply= (x*y) 0f;
		return multiply;
	}

	static String findTodaysDate_Time()
	{
		String D1 = "Date is 21/03/2022 and Time is 4.54 PM"  ;
		return D1;
	}

	public static void main(String args[])
	{
		System.out.println("Lets begin.. learning all the types of funcation");
		logOut();
		gotoLocation(10,20);
		float ans = multiply(5,4); // actual arguments
		System.out.println("Multiplication ans is : "+ans);
		String Today= findTodaysDate_Time();
		System.out.println("Today"+Today);
	}

}