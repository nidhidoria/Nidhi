import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	BankAccount ba1= new BankAccount();
		BankAccount ba2= new BankAccount();
		BankAccount ba3= new BankAccount();
		
		ba1.setBankAccount(1001, "NIDHI", 80000, LocalDate.of(2021,3,25),LocalDate.of(1992,6,13));
		ba2.setBankAccount(1002, "DHARA", 70000, LocalDate.of(2015,8,22),LocalDate.of(1987,7,10));
		ba3.setBankAccount(1003, "NAVYA", 60000, LocalDate.of(2021,12,01),LocalDate.of(2015,06,03));
	*/	
		MovieTickets mtkt1 = new MovieTickets();
		mtkt1.setTicketNo(301);
		mtkt1.setMovieName("Kashmir Files");
		mtkt1.settCost(200);
		mtkt1.setSeatNo(5);
		mtkt1.setmDateTime(LocalDateTime.of(2022,03,23,1,30));
		System.out.println("Movie Ticket1 Deatils " +mtkt1);
		
//		ba1.printBankAccount();
//		ba2.printBankAccount();
//		ba3.printBankAccount();
		
//		float updatedBalance = ba1.withdraw(90000);
//		System.out.println("New Balace of Nidhi is " +updatedBalance);
//		
//		updatedBalance = ba3.deposit(80000);
//		System.out.println("New Balace of Navya is " +updatedBalance);
//		
//		updatedBalance = ba3.deposit(40000);
//		System.out.println("New Balace of Navya is " +updatedBalance);
//		ba3.printBankAccount();
//		
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

class MovieTickets
{
	private int ticketNo;
	private String movieName;
	private float  tCost;
	private int seatNo;
	private LocalDateTime mDateTime;
	
	public void  setMovieTickets(int ticketNo, String movieName, float tCost, int seatNo, LocalDateTime mDateTime) {
		
		this.ticketNo = ticketNo;
		this.movieName = movieName;
		this.tCost = tCost;
		this.seatNo = seatNo;
		this.mDateTime = mDateTime;
	}

	@Override
	public String toString()
	{
		return "MovieTickets [ticketNo=" + ticketNo + ", movieName=" + movieName + ", tCost=" + tCost + ", seatNo="
				+ seatNo + ", mDateTime=" + mDateTime + "]";
	}
	
	public int getTicketNo() 
	{
	return ticketNo;
	}

	public void setTicketNo(int ticketNo)
	{
		this.ticketNo = ticketNo;
	}

	public String getMovieName()
	{
		return movieName;
	}

	public void setMovieName(String movieName) 
	{
		this.movieName = movieName;
	}

	public float gettCost()
	{
		return tCost;
	}

	public void settCost(float tCost)
	{
		this.tCost = tCost;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public LocalDateTime getmDateTime() {
		return mDateTime;
	}

	public void setmDateTime(LocalDateTime mDateTime) {
		this.mDateTime = mDateTime;
	}
	
	
	
}

