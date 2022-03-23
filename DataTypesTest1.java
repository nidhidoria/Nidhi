
public class DataTypesTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte playerNumber = 10;  // -128 ...0....127
		System.out.println("Player Number   :"  +playerNumber);
		System.out.println("Byte's Min Value:" +Byte.MIN_VALUE);
		System.out.println("Byte's Max Value:" +Byte.MAX_VALUE);
		System.out.println("Byte's size     :" +Byte.SIZE+ " bits");
		System.out.println("*****************************************");
		
		short rollNumber = 12312; 
		System.out.println("Roll Number     :"  +rollNumber);
		System.out.println("Short's Min Value:" +Short.MIN_VALUE);
		System.out.println("Short's Max Value:" +Short.MAX_VALUE);
		System.out.println("Short's size     :" +Short.SIZE+ " bits");
		System.out.println("*****************************************");
		
		int employeeCode = 756982;  
		System.out.println("Emoployee Code :"  +employeeCode);
		System.out.println("Int's Min Value:" +Integer.MIN_VALUE);
		System.out.println("Int's Max Value:" +Integer.MAX_VALUE);
		System.out.println("Int's size     :" +Integer.SIZE+ " bits");
		System.out.println("*****************************************");
		
		float price = 3956.20f;  
		System.out.println("Price            :"  +price);
		System.out.println("Float's Min Value:" +Float.MIN_VALUE);
		System.out.println("Float's Max Value:" +Float.MAX_VALUE);
		System.out.println("Float's size     :" +Float.SIZE+ " bits");
		System.out.println("*****************************************");
		
		long accountNo = 8321047565l;  
		System.out.println("Account No     :"  +accountNo);
		System.out.println("Long's Min Value:" +Long.MIN_VALUE);
		System.out.println("Long's Max Value:" +Long.MAX_VALUE);
		System.out.println("Long's size     :" +Long.SIZE+ " bits");
		System.out.println("*****************************************");
		
		double distance = 0.214596f;  
		System.out.println("Distance           :"  +distance);
		System.out.println("Double's Min Value:" +Double.MIN_VALUE);
		System.out.println("Double's Max Value:" +Double.MAX_VALUE);
		System.out.println("Double's size     :" +Double.SIZE+ " bits");
		System.out.println("*****************************************");
		
		
		char name ='A';  
		System.out.println("Name            :"  +name);
		System.out.println("char's Min Value:" +Character.MIN_VALUE);
		System.out.println("char's Max Value:" +Character.MAX_VALUE);
		System.out.println("char's size     :" +Character.SIZE+ " bits");
		System.out.println("*****************************************");
		
		
		boolean isCertified = true;
		System.out.println("Is Certified : " +isCertified);
		
		if(isCertified)
			System.out.println("That's Great");
		else
			System.out.println("You can Try for that");
		
		System.out.println("*********************************************");
		
	}

}
