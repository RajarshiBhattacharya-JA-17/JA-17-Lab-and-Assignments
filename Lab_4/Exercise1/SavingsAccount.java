package exercise1;

public class SavingsAccount extends Account {

	private final double minimumBalance = 500.0;

	public double getMinimumBalance() {
		return minimumBalance;
	}
	
	public void withdraw(double val)
	{
		if(getBalance()-val < minimumBalance)
			System.out.println("Withdrawal Denied!! Insufficient Balance");
		else
			setBalance(getBalance() - val);
	}
}
