import java.util.Scanner;

public class Throws_demo {

	public static void demo() throws Exception
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X:");
		x=sc.nextInt();
			
		if(x>0)
		{
		System.out.println("Square of "+x+" is "+(x*x));
		}
		else
		{
			throw new Exception();
		}
		//demo();   loop chalu rakhva mate use thy 
	}	
	public static void main(String[] args) {
		try {
			demo();
		}catch(Exception e) {
			System.out.println("Please enter positive value" );
		}finally {
			System.out.println("Finally called");
		}
	}
}
