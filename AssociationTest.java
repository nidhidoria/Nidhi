
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("Veena");
	//	Farmer fm1= new Farmer();
		
		Seeds s1= new Seeds();
		s1.setSeedname("Cotton");
	//	p1.setName("Vina");
	//	fm1.doFarming(s1);
		
		//Cotton c1 = new Cotton();
		
//		if(s1.getSeedname() == "Cotton")
//		{
//			 Cotton c1 = s1.growCotton();
//			 Yarn y1= c1.spin();
//			 Fabric f1=y1.weave();
//			 f1.print();
//		}
//		else
//		{
//			s1.growWheat();
//		}
	}

}
class Person
{
	String Name;

	public Person(String name) {
		super();
		Name = name;
	}
	

	
}
class Farmer extends Person 	//isA
{
	
///	Farm fm = new Farm(); 		//hasA 
	Seeds s;
	
	
	
	public Farmer(String name, Seeds s) {
	super(name);
	this.s = s;
}
	



	@Override
	public String toString() {
		return "Farmer [s=" + s + ", Name=" + Name + "]";
	}




	void doFarming(Seeds s,String Name) 	//useA
	{
		
		System.out.println( Name+ " is Farming... " +s+ " Seeds");
		
	}
}
//
//class Farm 
//{
//	CottonFarm cfm = new CottonFarm(); //hasA
//	WheatFarm wfm = new WheatFarm();  //hasA
//}
//class CottonFarm extends Farm
//{
//
//}
//
//class WheatFarm extends Farm
//{
//	  
//}
class Seeds
{
	String seedname;

	public String getSeedname() {
		return seedname;
	}

	public void setSeedname(String seedname) {
		this.seedname = seedname;
	}
	
//	Cotton growCotton()			//producesA
//	{
//		Cotton c1= new Cotton();
//		return c1;
//	}
//	
//	Wheat growWheat()			//producesA
//	{
//		Wheat wh1= new Wheat();
//		return wh1;
//	}
//	
	
}
//
//
//
//class Cotton
//{
//	Yarn spin()    	//producesA
//	{
//		Yarn y1= new Yarn();
//		return y1;
//	}
//}
//
//class Yarn 
//{
//	Fabric weave()		//producesA
//	{
//		Fabric fb = new Fabric();
//		return fb;
//	}
//}
//
//class Fabric
//{
//	void print()
//	{
//		System.out.println("Fabric Made");
//	}
//}
//class Wheat
//{
//	Roti grind()		//producesA
//	{
//		Roti r1= new Roti();
//		return r1;
//	}
//
//}
//
//class Roti
//{
//	
//}
//
//
//
//	