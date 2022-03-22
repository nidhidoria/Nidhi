class FunctionTest
{
	static void clearScreen()
	{
		System.out.println("Clearing the screen");
	}

	static void gotoLocation(int x,int y)
	{
		System.out.println("goint to loaction "+x+","+y);
	}

	static float findAverage(int x,int y,int z) //formal arguments
	{
		float avg = ( x + y + z) / 3.0f;
		return avg;
	}

	static float findTheDistanceBetweenTheEarthAndTheSun()
	{
		float SPEED_OF_LIGHT = 186000.519f; //miles per sec
		float TIME_TO_REACH_ON_EARTH = 480; // seconds
		float DISTANCE = SPEED_OF_LIGHT * TIME_TO_REACH_ON_EARTH;
		return DISTANCE;
	}

	public static void main(String args[])
	{
		System.out.println("Lets begin.. learning all the types of funcation");
		clearScreen();
		gotoLocation(10,20);
		float ans = findAverage(1,2,7); // actual arguments
		System.out.println("ans is : "+ans);
		float dist = findTheDistanceBetweenTheEarthAndTheSun();
		System.out.println("distance is : "+dist);
	}

}