import java.util.Scanner;

public class Throw_demo {

	public static void demo()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		try
		{
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
		}catch(Exception e) 
			{
				System.out.println("Please enter positive value"+e);
				demo();
			}
	}	
	public static void main(String[] args) {
		demo();
	}	
}
