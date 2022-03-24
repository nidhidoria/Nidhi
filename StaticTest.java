
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books.totalBooks();
		
		Books b1= new Books("Alchemist" ,1001,"Krina");
		Books b2= new Books("The Secret" ,9850,"Priyanka");
		Books b3= new Books("The Magic" ,1001,"Upasana");
		System.out.println("Book1 :" +b1);
		System.out.println("Book2 :" +b2);
		System.out.println("Book3 :" +b3);
		Books.totalBooks();
				
		Books b4= new Books("Anviksha" ,985,"Divya");
		System.out.println("Book4 :" +b4);
		Books.totalBooks();
		
		Books b5= new Books("Banaras Dairy" ,1001,"Ruhi");
		Books b6= new Books("2State" ,9850,"Sweta");
		System.out.println("Book5 :" +b5);
		System.out.println("Book6 :" +b6);
		Books.totalBooks();
		
		b5.retrunBook(b6);
		System.out.println("Book5 :" +b5);
		System.out.println("Book6 :" +b6);
		Books.totalBooks();
	}
	
	
}

 class Books
{
	private static int BookCount;
	
	public static void totalBooks()
	{
		System.out.println("Total Books in Library is" +BookCount);
	}
	
	private String bname;
	private int bid;
	private String pname;
	private boolean isAvailable;

	public Books(String bname, int bid, String pname) {
		super();
		this.bname = bname;
		this.bid = bid;
		this.pname = pname;
		this.isAvailable =false;
		BookCount++;
	}

	@Override
	public String toString() {
		return "books [bname=" + bname + ", bid=" + bid + ", pname=" + pname + ", isAvailable=" + isAvailable + "]";
	}
	
	void retrunBook(Books b)
	{
		System.out.println(b.pname+ " is Returning book  " +b.bname+ " to " +pname);
		BookCount--;
		b.isAvailable = true;
		
	}
	
	

}
