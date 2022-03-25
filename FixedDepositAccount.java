import java.time.LocalDate;

public class FixedDepositAccount extends SavingAccount {

	LocalDate maturitydate;
	float maturityamt;
	public FixedDepositAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate,
			int age) {
		super(accno, acname, acbalance, acopDate, birthDate, age);
		// TODO Auto-generated constructor stub
	}

	public FixedDepositAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate,
			int age, float rateOfInterest) {
		super(accno, acname, acbalance, acopDate, birthDate, age, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	public FixedDepositAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate,
			int age, float rateOfInterest,LocalDate maturitydate, float maturityamt) {
		super(accno, acname, acbalance, acopDate, birthDate, age,rateOfInterest);
		this.maturitydate = maturitydate;
		this.maturityamt = maturityamt;
	}
	void printFixedDepositAccount()
	{
		super.printSavingAccount();
		System.out.println("Maturity Date is  " +maturitydate);
		System.out.println("Maturity Amount is  " +maturityamt);
	}
	
	

}
