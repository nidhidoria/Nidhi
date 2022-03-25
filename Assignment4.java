
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person1
{
	TradingBusiness trdObj1 = new TradingBusiness();  //hasA
}
class TradingBusiness
{
	Vehicle vhlObj1 = new Vehicle(); //hasA
}
class Vehicle
{
	
}  
class Twowheeler extends Vehicle  //isA
{
	
}
class FourWheeler extends Vehicle  //isA
{
	Car cr= new Car();   //hasA
}
class Car extends FourWheeler  //isA
{
	String Name;
	AirConditioner ac = new AirConditioner(); //hasA
}

class AirConditioner 
{
	Gastank gst = new Gastank();  //hasA
}
class Gastank
{
	GasBill fill(Gas g)   // usesA
	{
		GasBill gsb = new GasBill();  //produceA
		return gsb;
	}
}
class GasBill
{
	
}
class Gas
{
	
}


class city
{
	School scl = new School();    //hasA
	Library1 lbr = new Library1();  //hasA
	Hotel htl = new Hotel();		//hasA
	Aquariam aqr = new Aquariam();		//hasA
}

class Library1
{
	Book3 b3= new Book3();			//hasA
			
}
class Book3 
{
	
}
class Hotel
{
	Feedbackform fbf = new Feedbackform();  //hasA
}
class Feedbackform
{
	
}
class Restaurant extends Hotel		//isA
{
	
}
class FoodRestaurant extends Restaurant  //isA
{
	void serveFood(Food f)	//usesA
	{
		
	}
}

class KFC extends FoodRestaurant // isA
{
	LiveMusic lm = new LiveMusic();  //hasA
}

class LiveMusic
{
	Music playMusic(Guitar g)  //useA
	{
		Music msc = new Music();
		return msc;    //produesA
	}
}

class Music
{
	
}
class Guitar		
{
	
}

class Food
{
	
}
class School
{
	Classroom clr = new Classroom();
}

class Classroom
{
	Student s = new Student();	//hasA
	ReportCard takeExam(Laptop l)	//usesA
	{	
		ReportCard rcd = new ReportCard();
		return rcd;				//producesA
	}
}
class ReportCard
{
	
}
class Laptop
{
	
}
class Student
{
	
}
class Aquariam
{
	Fish f = new Fish();  //hasA
}
class Fish
{
	
}