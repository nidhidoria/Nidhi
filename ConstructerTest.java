
public class ConstructerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Camera cam1 = new Camera(10);
		Camera cam2 = new Camera(20);
		Camera cam3 = new Camera(30);
				
		cam1.setCamera(40);
		cam1.setCamera(70);
		cam2.setCamera(50);
		cam3.setCamera(60); */
		Camera cam1 = new Camera(101, "Sony", 30, 50000, 5001, "APF 15mm", 12520);
		Camera cam2 = new Camera(320, "nikon", 50, 90000, 3001, "PF 80mm", 7000);
		Camera cam3 = new Camera(701, "canon", 40, 60000, 1001, "zm 19mm", 25000);
		
		cam1.printCamera();
		cam2.printCamera();
		cam3.printCamera();
		
		cam1.click();
		cam2.click();
		cam3.click();
	
			
	}

}

class Camera
{	
	int cameraID;
	String cameraBrand;
	int megaPixel;
	float cost;
	Lens lens;
	
	public Camera(int cameraID, String cameraBrand, int megaPixel, float cost,int lid, String ltype, float lcost) {
		super();
		this.cameraID = cameraID;
		this.cameraBrand = cameraBrand;
		this.megaPixel = megaPixel;
		this.cost = cost;
		lens = new Lens(lid, ltype, lcost);
		
	}

	void printCamera()	
	{
		
		System.out.println("Camera ID     :"  +cameraID);
		System.out.println("Camera Brand  :"  +cameraBrand);
		System.out.println("Camera MP     :"  +megaPixel);
		System.out.println("Camera cost   :"  +cost);
		lens.printLensDetails();
		System.out.println("***********************************************");
		
	}
	
	void click()
	{
		lens.zoomIn();
		lens.zoomOut();
		System.out.println("Clicking Picture.....");
	}
	
}

class Lens
{
	int lensID;
	String lensType;
	float cost;
	
	
		
	public Lens(int lensID, String lensType, float cost) {
		super();
		this.lensID = lensID;
		this.lensType = lensType;
		this.cost = cost;
	}
	
	void printLensDetails()
	{
		System.out.println("Lens ID       :" +lensID);
		System.out.println("Lens Type     :" +lensType);
		System.out.println("cost          :" +cost);
	}

	void zoomIn()
	{
		System.out.println("Zooming In with.. " +lensType);	
	}
	
	void zoomOut()
	{
		System.out.println("Zooming Out with.. " +lensType);	
	}
	
	
}

