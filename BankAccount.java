import java.time.LocalDate;

public abstract class BankAccount implements Withdrawing,Depositing
{
	

		private int accno;
		private String acname;
		private float acbalance;
		private LocalDate acopDate;
		private LocalDate birthDate;
		private int age;
		
				
		
		public BankAccount(int accno, String acname, float acbalance, LocalDate acopDate, LocalDate birthDate,
				int age) {
			super();
			this.accno = accno;
			this.acname = acname;
			this.acbalance = acbalance;
			this.acopDate = acopDate;
			this.birthDate = birthDate;
			this.age = age;
		}
		
		

		@Override
		public String toString() {
			return "BankAccount [accno=" + accno + ", acname=" + acname + ", acbalance=" + acbalance + ", acopDate="
					+ acopDate + ", birthDate=" + birthDate + ", age=" + age + "]";
		}



		void setBankAccount(int accno,String acname,float acbalance,LocalDate acopDate ,LocalDate birthDate)
		{
			System.out.println("Setting Account Details \n");
			this.accno = accno;
			this.acname = acname;
			this.acbalance = acbalance;
			this.acopDate = acopDate;
			this.birthDate = birthDate;
			LocalDate today = LocalDate.now();
			this.age = today.getYear()- birthDate.getYear();
				
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
		
		
		public float withdraw(float amt)
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
		
		public float deposit(float amt)
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

interface Withdrawing
{
	float withdraw(float amt) ; 	
}

interface Depositing
{
	float deposit(float amt) ; 	
}



