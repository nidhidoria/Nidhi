import java.time.LocalDate;

public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sb1 = new SavingAccount(1001, "Divya", 2000, LocalDate.of(2020, 05, 25), LocalDate.of(2002, 06, 10), 18, 3.5f);
		
		sb.printSavingAccount();
		System.out.println("**********************************************************");
		FixedDepositAccount fd = new FixedDepositAccount(1001, "Divya", 2000, LocalDate.of(2020, 05, 25), LocalDate.of(2002, 06, 10), 18, 3.5f, LocalDate.of(2022, 03, 25), 35000);
		fd.printFixedDepositAccount();
		
		
		 void fundTransfer(SavingAccount sb1, SavingAccount sb2, float amt)
		 {
			 System.out.println("Fund Transfer Started..");
			 
		 }
	
	
	}

}
