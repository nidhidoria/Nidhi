class Surgery
{
	public static void switchOn()
	{
		System.out.println("Switch is on");
	}
	public static void surgeryInProgress()
	{
		System.out.println("Surgery is in Progress");
	}
	public static void switchOff()
	{
		System.out.println("Switch is off");
	}
	public static void main(String abd[])
	{
		System.out.println("Surgery Started.....");
			switchOn();
			surgeryInProgress();
			switchOff();
			switchOn();
	}
	
}