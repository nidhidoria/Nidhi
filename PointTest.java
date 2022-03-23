
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p2 = new Point2D();
		p2.setPoint2D(30, 40);
		p2.viewPoint2D();
		System.out.println("*****************************");
		
		Point3D p3 = new Point3D();
		p3.setPoint3D(60, 70, 80);
		p3.viewPoint3D();
		System.out.println("*****************************");
		
		Point4D p4 = new Point4D();
		p4.setPoint4D(2,3,8,9);
		p4.viewPoint4D();
		System.out.println("*****************************");
		
	}

}

class Point2D
{
	int x;
	int y;
	
	void setPoint2D(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Setting Point2D");
	}
	void viewPoint2D()
	{
		System.out.println("Viewing Point 2D : " +x+ "," +y);
	}
}

class Point3D extends Point2D
{
	int z;
	
	void setPoint3D(int x,int y,int z)
	{
		super.setPoint2D(x, y);
		this.z=z;
		System.out.println("Setting Point3D");
	}
	void viewPoint3D()
	{
		System.out.println("Viewing Point 2D : " +x+ "," +y+ "," +z);
	}
}

class Point4D extends Point3D
{
	int f;
	
	void setPoint4D(int x,int y,int z, int f)
	{
		super.setPoint3D(x, y,z);
		this.f=f;
		System.out.println("Setting Point4D");
	}
	void viewPoint4D()
	{
		System.out.println("Viewing Point 4D : " +x+ "," +y+ "," +z+ "," +f);
	}
}

