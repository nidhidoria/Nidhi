
public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		Mosquito mst= new Mosquito();
		cr.doDriving();
		mst.doflying();
		
		
		
	}

}

interface Travel
{
	void doTravelling();
}
interface Fly
{
	void doflying();
}
interface Drive
{
	void doDriving();
}

class MovableObject implements Travel
{
	String name;
	
	
	
	public MovableObject() {
		super();
	}



	@Override
	public void doTravelling() {
		// TODO Auto-generated method stub
		System.out.println("Travelling");
	}
	
}
class Mosquito extends MovableObject implements Fly
{

	@Override
	public void doflying() {
		// TODO Auto-generated method stub
		
	}

}

class Car extends MovableObject implements Drive
{

	@Override
	public void doDriving() {
		// TODO Auto-generated method stub
		System.out.println("Driving");
	}
	
}

class Anotherclass
{
	void Method(Mosquito m)
	{
		m.doflying();
	}
}

