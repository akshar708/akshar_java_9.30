class Box
{
	double height,width,depth;
	
	Box()
	{
		System.out.println("Default constructor:");
		height=3;
		width=4;
		depth=5;
	}
	
	Box(double h,double w,double d)
	{
		System.out.println("Parameterized constructor");
		height=h;
		width=w;
		depth=d;
	}
	
	Box(Box b)
	{
		System.out.println("Copy constructor");
		height=b.height;
		width=b.width;
		depth=b.depth;
	}
	
	void volume()
	{
		System.out.println("Volume:" +(height*width*depth));
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		
		Box b1=new Box();
		b1.volume();
		
		Box b2=new Box(1,2,3);
		b2.volume();
		
		Box b3=new Box(b2);
		b3.volume();
	
	}
}
