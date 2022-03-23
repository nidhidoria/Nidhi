
public class ConstructerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam1 = new Camera(10);
		Camera cam2 = new Camera(20);
		Camera cam3 = new Camera(30);
				
		cam1.setCamera(40);
		cam1.setCamera(70);
		cam2.setCamera(50);
		cam3.setCamera(60);
			
	}

}

class Camera
{	
	int cameraID;
	String cameraBrand;
	int megaPixel;
	float cost;
	
	Camera(int megaPixel)
	{
		System.out.println("Camera is Constructed with constructer " +megaPixel+ " megapixel" );
		this.megaPixel = megaPixel;
	}
	
	
	
	void setCamera(int megaPixel)
	{
		System.out.println("Camera is Constructed with method " +megaPixel+ " megapixel");
		this.megaPixel = megaPixel;
		
	}
}

