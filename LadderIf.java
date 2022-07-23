import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		
		int s1,s2,s3;
		float sum;
		double per;
		String sname;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of student");
		sname=sc.next();
		
		System.out.println("Enter marks of subject 1");
		s1=sc.nextInt();
		System.out.println("Enter marks of subject 2");
		s2=sc.nextInt();
		System.out.println("Enter marks of subject 3");
		s3=sc.nextInt();
		
		sum=s1+s2+s3;
		
		per=sum/3;
		
		System.out.println("Percentage:" +per);
		
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First class");
		}
		else if(per>=50)
		{
			System.out.println("Second class");
		}
		else if(per>=40)
		{
			System.out.println("Third class");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
