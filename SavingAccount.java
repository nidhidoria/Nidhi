import java.time.LocalDate;

public class SavingAccount extends BankAccount {

	float rateOfInterest;
	public SavingAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate, int age) {
		super(accno, acname, acbalance, acopDate, birthDate, age);
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate, int age,
			float rateOfInterest) {
		super(accno, acname, acbalance, acopDate, birthDate, age);
		this.rateOfInterest = rateOfInterest;
	}
	
	
	void printSavingAccount()
	{
		super.printBankAccount();
		System.out.println("Rate Of Intrest is  " +rateOfInterest);
		
	}
	

	
}
