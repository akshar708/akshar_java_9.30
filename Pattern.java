
public class Pattern {

/* 
 *   for
 *   
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 *   
 *   for(k=0;k<i;k)
 * 
 * */

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=0;i<=5;i++)
		{
			for(k=0;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
