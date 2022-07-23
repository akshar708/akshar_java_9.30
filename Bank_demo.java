import java.util.Scanner;

public class Bank_demo {

	public static void main(String[] args) {
		Bank_check_amount c=new Bank_check_amount(1, 1000);
		double amount;
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Deposite Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter Deposite Amount");
				amount=sc.nextDouble();
				c.deposite(amount);
			}
			
			else if(choice==2)
			{
				System.out.println("Enter Withdrawal Amount");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);					
				}catch(Bank_system e)
				{
					System.out.println("Sorry you need" +e.getamount()+ "Rs.");
				}
			}
			
			else if(choice==3)
			{
				c.checkbalance();
			}
			
			else
			{
				System.out.println("Thank you for using service");
				break;
			}
		}while(true);
		
	}
}
