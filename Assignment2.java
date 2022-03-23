import java.time.LocalDate;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1 = new Library();
	/*	Library l2 = new Library();
		Library l3 = new Library();
		Library l4 = new Library();
		Library l5 = new Library(); */
		l1.addBook(102, "Alchemist", "Poulo coelho", "motivational", 300, LocalDate.of(2015, 6, 10));
		l1.showBook();		
		l1.addBook(105, "2States", "Chetan Bhagat", "LoveStory", 200, LocalDate.of(2016, 07, 9));
		l1.showBook();
		l1.addBook(108, "Power Of Now", "Echart Tolly", "Motivational", 400, LocalDate.of(2013, 8,8));
		l1.showBook();
		l1.addBook(109, "Anviksha", "Jigna Patel", "Fiction", 100, LocalDate.of(2017, 8, 21));
		l1.showBook();
		l1.addBook(111, "Seat Of Soul", "Gary Zukav", "spiritual", 800, LocalDate.of(2000,5,31));
		l1.showBook();
	}

}	
 class Library
{
	private int bookID;
	private String bname;
	private String auther;
	private float price;
	private LocalDate publishDate;
	private String btype;
	public int noOfbook;
	
	void addBook(int bid,String bn,String aut,String btpe,float cost, LocalDate pbdate)
	{
		System.out.println("Adding Book in Library \n");
		bookID = bid;
		bname = bn;
		auther = aut;
		price = cost;
		publishDate = pbdate;
		noOfbook = noOfbook + 1;
	}

	void showBook()
	{
		System.out.println("BOOK ID             : " +bookID);
		System.out.println("BOOK Name           : " +bname);
		System.out.println("BOOK Auther Name    : " +auther);
		System.out.println("BOOK Type           : " +btype);
		System.out.println("BOOK Price          : " +price);
		System.out.println("BOOK Published Date : " +publishDate);
		System.out.println("Total No Of Book are: "  +noOfbook);
		System.out.println("*****************************************");
	}
	
	void purchasebook(String bname)
	{
		
	}
	
	
}
	
	




