
public class AnotherExampleTestForPassingAndReturningObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger psObj1= new Passenger("Heena", 23);
		System.out.println("Passenger1 is " +psObj1);
		System.out.println("**************************************");
		psObj1.setAge(25);
		psObj1.printPassenger();
		System.out.println("**************************************");
		Train trObj1 = new Train();
		trObj1.travel(psObj1);
		System.out.println("**************************************");
		Passenger psObj2= new Passenger("Reena", 25);
	//	trObj1.travel(psObj1, psObj2);
		System.out.println("**************************************");
		Destination dest1 = new Destination("Jaipur","Rajasthan");
		System.out.println(dest1);
		System.out.println("**************************************");
		Destination dest2 = trObj1.travel(psObj1, psObj2);
		System.out.println(dest2);
		System.out.println("**************************************");
		Destination dest3 = trObj1.travel(psObj1, psObj2, "Surat", "Gujarat");
		System.out.println(dest3);		
	}

}


class Passenger
{
	private String name;
	private int age;
	
	public Passenger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Passenger [Name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Changing age of " +name);
	}
	
	void printPassenger()
	{
		System.out.println("Passenger Name :" +name);
		System.out.println("Passenger Age :" +age);
	}

}


class Train
{

	void travel(Passenger x)
	{
		System.out.println( x.getName()+ " is travelling");
	}
	
	Destination travel(Passenger x, Passenger y)
	{
		System.out.println( x.getName()+ " is travelling with  " +y.getName());
		Destination dest1 = new Destination("Ahmedabad", "Guajrat");
		return dest1;
	}
	
	Destination travel(Passenger x, Passenger y,String state,String city)
	{
		Destination dest1 = new Destination("Surat", "Gujarat");
		System.out.println( x.getName()+ " is travelling with  " +y.getName()+ " at " +dest1.getCity()+ " city of state " +dest1.getState());
		return dest1;
	}
}

class Destination
{
	String city;
	String State;
	public Destination(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Destination [city=" + city + ", State=" + State + "]";
	}
	
	
	

}
