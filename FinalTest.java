
public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final float PI = 3.14f;
		System.out.println("PI :" +PI);
		GraphicalChess gc= new GraphicalChess();
		gc.moveBishop();
	}

}


class Chess
{
	final int TOTAL_SQUARES =64;
	final int WHITE_PAWN_COUNT =8;
	final int BLACK_PAWN_COUNT =8;
	
	 void moveBishop()  //camel move calculate the checkmate
	{
		System.out.println("moing the bishop diagonally bi-directional");
	}
}

class GraphicalChess extends Chess
{
	void moveBishop()
	{
		super.moveBishop();
		System.out.println("Graphical move of bishop is done...too..");
	}
}