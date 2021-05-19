package exercise1;

public class Account extends Person {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	Account(){
		
	}
	
	Account(long accNum, double balance, Person accHolder)
	{
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public void deposit(double val)
	{
		balance += val;
	}
	
	public void withdraw(double val)
	{
		balance -= val;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString()
	{
		return "Account[Account Holder[name="+accHolder.getName()+
				", age="+accHolder.getAge()+
				"], account number="+accNum+
				", balance="+balance+"]";
	}
}
