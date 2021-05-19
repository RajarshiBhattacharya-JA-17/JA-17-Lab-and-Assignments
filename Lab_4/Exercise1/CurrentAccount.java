package exercise1;

public class CurrentAccount extends Account{

	private double overdraftLimit = 2000;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double val)
	{
		if(val > overdraftLimit)
			System.out.println("Overdraft Limit Reached!! Withdrawal Denied!!");
		else
			setBalance(getBalance()- val);
	}
}
