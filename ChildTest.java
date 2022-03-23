
public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gf = new GrandFather();
		gf.farming();
		System.out.println("********************************");
		
		Father f = new Father();
		f.farming();
		f.banking();
		System.out.println("********************************");
		
		Child c = new Child();
		c.farming();
		c.banking();
		c.coding();
		System.out.println("********************************");
		
		
	}

}

class GrandFather
{
 GrandFather()
 {
	 System.out.println("GrandFather Constructer()...");
 }
 void farming()
 {
	 System.out.println("GrandFather is Farming using bull ");

 }
}

class Father extends GrandFather
{
 Father()
 {
	 System.out.println("Father Constructer()...");
 }
 void farming()
 {
	 System.out.println("Father is Farming using Tractor ");
 }
 void banking()
 {
	 System.out.println("Father is doing Banking");
 } 
 
}

class Child extends Father
{
 Child()
 {
	 System.out.println("Child Constructer()...");
 }
 void farming()
 {
	 System.out.println("Child is doing Organic Farming ");

 }
 void banking()
 {
	 System.out.println("Child is doing Net Banking");
 } 
 void coding()
 {
	 System.out.println("Child is doing Coding");
 } 
}
