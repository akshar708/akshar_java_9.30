import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		int a,b,c,d;
		String choice;
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		System.out.print("Enter you choice:");
		d=sc.nextInt();
		System.out.print("Enter A:");
		a=sc.nextInt();
		System.out.print("Enter B:");
		b=sc.nextInt();
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition is"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Subtraction is"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication is"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division is"+c);
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		System.out.println("Enter your choice yes/no");
		choice=sc.next();
		}
		while(choice.equals("yes"));
		sc.close();
	}
}
	

