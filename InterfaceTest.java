
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Children ch1 = new Children("Pinku");
		Children ch2 = new Children("Rinku");
		
		ch1.play("Ludo");
		ch1.study("Maths");
		System.out.println("********************************");
		ch2.play("Chess");
		ch2.study("Science");
		System.out.println("********************************");
	
		Person ps1 = new Person("Kanwar");
		ps1.study("Jave");
		ps1.play("Guitar");
		
	}
}

interface Play
{
	void play(String game);
}

interface Study
{
	void study(String subj);
}


class Children implements Play,Study
{	
	String name;
	
	public Children(String name) {
		super();
		this.name = name;
	}

	@Override
	public void study(String subj) {
		System.out.println(name+ " is Studying Subject  " +subj);
		
	}

	@Override
	public void play(String game) {
		System.out.println(name+ " is Playing " +game);
		
	}
	
}

class Person implements Play,Study
{
	String name;
	
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void study(String subj) {
		// TODO Auto-generated method stub
		System.out.println(name+ " is Studying Subject  " +subj);
	}

	@Override
	public void play(String game) {
		// TODO Auto-generated method stub
		System.out.println(name+ " is Playing " +game);
	}
	

}

