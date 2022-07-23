import java.util.Scanner;

public class Exception_demo {

	public static void main(String[] args) {
		System.out.println("Start Code");
		
		int a,b,c;
		try {
			
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
		
		System.out.print("Enter B:");
		b=sc.nextInt();
		c=a/b;
		System.out.println("C is :" +c);
		
		int array[]= {1,2,3,4,5};
		System.out.print("Enter index number of array");
		int index=sc.nextInt();
		System.out.println("Element:" +array[index]);
		
		}catch(Exception e)
		{
			System.out.println("Exception caught" +e);
		}
		System.out.println("End Code");
	}
}
