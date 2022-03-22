import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount ba1= new BankAccount();
		BankAccount ba2= new BankAccount();
		BankAccount ba3= new BankAccount();
		
		ba1.setBankAccount(1001, "NIDHI", 80000, LocalDate.of(2021,3,25),LocalDate.of(1992,6,13));
		ba2.setBankAccount(1002, "DHARA", 70000, LocalDate.of(2015,8,22),LocalDate.of(1987,7,10));
		ba3.setBankAccount(1003, "NAVYA", 60000, LocalDate.of(2021,12,01),LocalDate.of(2015,06,03));
		
		ba1.printBankAccount();
		ba2.printBankAccount();
		ba3.printBankAccount();
		
		float updatedBalance = ba1.withdraw(90000);
		System.out.println("New Balace of Nidhi is " +updatedBalance);
		
		updatedBalance = ba3.deposit(80000);
		System.out.println("New Balace of Navya is " +updatedBalance);
		
		updatedBalance = ba3.deposit(40000);
		System.out.println("New Balace of Navya is " +updatedBalance);
		ba3.printBankAccount();
		
/*		float updatedBalance = ba1.withdraw(10000);
		System.out.println("New Balace of " +ba1.acname+ " is " +updatedBalance);
		
		updatedBalance = ba3.deposit(20000);
		System.out.println("New Balace of " +ba3.acname+ " is " +updatedBalance);
	
		float si = ba1.calulateIntrest();
		System.out.println("Simple Intrest of " +ba1.accno+" is " +si);*/
		
	/*	LocalDateTime t1 = LocalDateTime.now();
		System.out.println("Today's Date and time is " +t1);
		System.out.println("Today's Date is " +t1.getDayOfMonth());
		System.out.println("Current Month is " +t1.getMonth()); */
	}
}

class BankAccount
{

	private int accno;
	private String acname;
	private float acbalance;
	private LocalDate acopDate;
	private LocalDate birthDate;
	private int age;
	
	void setBankAccount(int a,String b,float c,LocalDate aod ,LocalDate dob)
	{
		System.out.println("Setting Account Details \n");
		accno = a;
		acname = b;
		acbalance = c;
		acopDate = aod;
		birthDate = dob;
		LocalDate today = LocalDate.now();
		age = today.getYear()- dob.getYear();
			
	}
	
	void printBankAccount()
	{
		System.out.println("Account Number    : " +accno);
		System.out.println("Account Name      : " +acname);
		System.out.println("Account Balance   : " +acbalance);
		System.out.println("Account Open Date : " +acopDate);
		System.out.println("Account Holder Dob: " +birthDate);
		System.out.println("Account holder Age: " +age);
		float si = calulateIntrest();
		System.out.println("Simple Intrest of  is " +si);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	float withdraw(float amt)
	{
		System.out.println("Withdrawing " +amt);
		if(amt > acbalance)
		{
			System.out.println("Insuffcient Fund");
		}
		else
		{
			acbalance = acbalance - amt;
		}
		
		return acbalance; 
	}
	
	float deposit(float amt)
	{
		 System.out.println("Deposit " +amt);
		 if (amt > 50000)
		 {
			 System.out.println("Please Provide Source of Income ");
		 }
		 else
		 {
			 acbalance = acbalance + amt;
		 }
		  return acbalance;
	}
	
	 private float calulateIntrest()
	{
		System.out.println("Calculating Simple Intrest");
		float si = acbalance*1*2.5f/100;
		return si;
	}
}

