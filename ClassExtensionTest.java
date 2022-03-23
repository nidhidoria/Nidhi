
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1= new Doctor();
		d1.setDoctor("MBBS",500);
		System.out.println(d1);
		d1.dignose();
		System.out.println("*****************************************");
		
		Surgen s1 = new Surgen();
		s1.setSurgen("MBBS",2000,"MS");
		System.out.println(s1);
		s1.dignose();
		s1.cut();
		s1.stich();
		System.out.println("*****************************************");
		
		SpecialSurgen sp1 = new SpecialSurgen();
		sp1.setSpecialSurgen("MBBS",2000,"MS","MHS");
		System.out.println(sp1);
		sp1.dignose();
		sp1.cut();
		sp1.stich();
		sp1.surgery();
		
	}

}

class Doctor
{
	String qualification;
	int fees;
	
	void setDoctor(String qualification, int fees) 
	{
		this.qualification = qualification;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + ", fees=" + fees + "]";
	}
	
	void dignose()
	{
		System.out.println("Doctor is Diagnosing..");
	}
	

}


class Surgen extends Doctor
{
	String surgenqualification;

	void setSurgen(String qualification, int fees,String surgenqualification) {
		super.setDoctor(qualification, fees);
		this.surgenqualification = surgenqualification;
	}

	@Override
	public String toString() {
		return "Surgen [surgenqualification=" + surgenqualification + ", qualification=" + qualification + ", fees="
				+ fees + "]";
	} 
	
	void dignose()
	{
		System.out.println("Surgen is Diagnosing..");
	}
	void cut()
	{
		System.out.println("Surgen is Cutting..");
	}
	void stich()
	{
		System.out.println("Surgen is Stiching..");
	}
	
}


class SpecialSurgen extends Surgen
{
	String specialqualification;
	
	
	void  setSpecialSurgen(String qualification, int fees,String surgenqualification,String  specialqualification)
	{
		super.setSurgen(qualification,fees,surgenqualification);
		this.specialqualification = specialqualification;
	}
	
	@Override
	public String toString() {
		return "SpecialSurgen [specialqualification=" + specialqualification + ", surgenqualification="
				+ surgenqualification + ", qualification=" + qualification + ", fees=" + fees + "]";
	}

	void dignose()
	{
		System.out.println("SpecialSurgen is Diagnosing..");
	}
	void cut()
	{
		System.out.println("SpecialSurgen is Cutting..");
	}
	void stich()
	{
		System.out.println("SpecialSurgen is Stiching..");
	}
	void surgery()
	{
		System.out.println("SpecialSurgen is doing Surgery..");
	}
	
}