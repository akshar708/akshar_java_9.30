import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		a=sc.nextInt();
		System.out.println("Enter  value of B:");
		b=sc.nextInt();
		System.out.println("Enter value of C:");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is larger number");
			}
			else
			{
				System.out.println("C is larger number");
			}
		}
			
		else if(b>c)
		{
			System.out.println("B is larger number");
		}
		else
		{
			System.out.println("C is larger number");
		}
		sc.close();
	}
}
