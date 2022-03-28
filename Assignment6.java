import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieTicket mtkObj1;
		MovieTicket mtkObj2;
	//	MovieTicket mtkObj2 = new MovieTicket("Kashmir Files", 20);
	//	MovieTicket mtkObj3 = new MovieTicket("Pushpa", 10)  ;
		try {
			
		//	Scanner scan = new Scanner(System.in);
		//	int x = scan.nextInt();
			mtkObj1 = new MovieTicket("RRR",5);
			mtkObj1.start();
			mtkObj2 = new MovieTicket("Pushpa", 10);
			mtkObj2.start();		
					
		} catch (SeatsOutofRangeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Handler1 : Seats Not Available" +e);
		}
//		catch (TicketNotAvailableException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("Handler2 : Tikcets Not Available" +e);
//		
//		}
	}

}

class MovieTicket extends Thread
{
	static int noOfSeats = 100;
	String mname;
	final int availableseats;
	int bookTicket;
	
	
	
	public MovieTicket(String mname, int bookTicket) throws SeatsOutofRangeException //, TicketNotAvailableException
	{
		super();
		this.mname = mname;
		this.bookTicket = bookTicket;
		if(bookTicket >noOfSeats)
		{
			throw new SeatsOutofRangeException("This much Seats are not Available");
		}
//		else if (availableseats == 0)
//		{
//			throw new TicketNotAvailableException("Housefull");
//		}
		availableseats = 100- bookTicket;
	}
	
	public void run()
	{
		System.out.println("Booking " +bookTicket+  " Ticket of "+mname);
		
	}

	@Override
	public String toString() {
		return "MovieTicket [mname=" + mname + ", availableseats=" + availableseats + ", bookTicket=" + bookTicket
				+ "]";
	}
	
}

class SeatsOutofRangeException extends Exception
{
	SeatsOutofRangeException(String str)
	{
		super(str);
	}
	
}
//class TicketNotAvailableException extends RuntimeException
//{
//	TicketNotAvailableException(String str)
//	{
//		super(str);
//	}
//
//}
