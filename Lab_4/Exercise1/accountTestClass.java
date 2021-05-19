package exercise1;

//import java.util.Scanner;

public class accountTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person();
		smith.setName("Smith");
		smith.setAge(25);
		
		Person kathy = new Person("Kathy", 30);
		
		Account smithAcc = new SavingsAccount();
		smithAcc.setAccHolder(smith);
		smithAcc.setAccNum(123001);
		smithAcc.setBalance(2000);
		
		Account kathyAcc = new CurrentAccount();
		kathyAcc.setAccHolder(kathy);
		kathyAcc.setAccNum(100001);
		kathyAcc.setBalance(3000);
		
		System.out.println(smithAcc.toString());
		System.out.println(kathyAcc.toString());
		
		System.out.println("After depositing INR 2000 in Smith's Account");
		smithAcc.deposit(2000);
		System.out.println(smithAcc.getBalance());
		
		System.out.println("After withdrawing INR 2000 from Kathy's Account");
		kathyAcc.withdraw(2000);
		System.out.println(kathyAcc.getBalance());
	}

}
