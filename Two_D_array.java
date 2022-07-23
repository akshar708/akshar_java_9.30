import java.util.Scanner;

public class Two_D_array {
		public static void main(String[] args) {
			int a[][]=new int[4][4];
			int i,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2d array");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
				System.out.print("Element Row:"+i+" Colomn"+j+" " );
				a[i][j]=sc.nextInt();
				}
			}
			System.out.println("2D element are:");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					//System.out.println("A["+i+"] ["+j+"] " +a[i][j]);// line ma lakhva mate use thy aa
					System.out.print("  "+a[i][j]);
				}
				System.out.println();
			}
				
		}
	
}
