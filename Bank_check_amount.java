
public class Bank_check_amount {

	int acno;
	double balance=0;
	
	public Bank_check_amount(int acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}
	
	public void deposite(double amount)
	{
		this.balance=this.balance+amount;
	}

	public void withdraw(double amount) throws Bank_system{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
		}
		else
		{
			double needs=amount-this.balance;
			throw new Bank_system(needs);
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Current Balance:" +this.balance);
	}
	
}
