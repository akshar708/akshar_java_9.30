import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp,sum=0;
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter number:");//
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("--------------------------");
		System.out.println("Array element are:");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] :" +a[i] );
		}
		System.out.println("--------------------------");
		System.out.println("Sum of array:" +sum);
		for(i=0;i<a.length;i++)
		{
			for(j=0/*i+1*/;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}	
		System.out.println("--------------------------");
		System.out.println("Element in ascending oreder:");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] "+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0/*i+1*/;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		System.out.println("--------------------------");
		System.out.println("Element in descending oreder:");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] "+a[i]);
			
		}
	
}
}
