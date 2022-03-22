
public class Test1 {

	public static void main(String[] args) {
	Tiger t1= new Tiger();
		t1.roar();
		t1.hunt("Rebit");
		int c = t1.jump(7,8);
		System.out.println("Tiger covered " +c+ " feet area" );
		int s = t1.swimming();
		System.out.println("Tiger swam " +s+ " meters"); 
		
		Country c1 = new Country();
		c1.nation();
		c1.name("India");
		String x = c1.flagDetails(18,"Rectangle");
		System.out.println(x);
		String b = c1.nationalBird();
		System.out.println("National Bird is  " +b);
		
		
	}

}

class Tiger
{
	void roar()
	{
		System.out.println("Tiger is roaring..");
	}
	void hunt(String theHuntedAnimal)
	{
		System.out.println("Tiger is Hunting " +theHuntedAnimal);
	}
	int jump(int length,int height)
	{
		System.out.println("Tiger is jumping");
		int cover = length * height;
		return cover;
	}
	int swimming()
	{
		System.out.println("Tiger is Swimming..10 mtrs");
		return 10;
	}
}


class Country
{
	void nation()
	{
		System.out.println("\nDeatils of Country");
	}
	void name(String s)
	{
		System.out.println("Name of the country is " +s);
	}
	String flagDetails(int size,String shape)
	{

		String s1 = "National Flag has " +shape+ " Shape and "  +size+ " size";
		return s1;
	}
	String nationalBird()
	{
		return "Peacock";
	}
}