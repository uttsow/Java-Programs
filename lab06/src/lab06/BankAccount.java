package lab06;

public class BankAccount {
	
	private double balance;
	private int idNum;
	private static int numAccounts = 0;
	
	public BankAccount(double aBalance){
		balance = aBalance;
		if (balance < 0){
			throw new IllegalArgumentException("Can't be negative");
		}
		this.idNum = BankAccount.numAccounts;
		BankAccount.numAccounts++;
		
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getidNum(){
		return idNum;
	}
	
	static void reset(){
		BankAccount.numAccounts = 0;
	}
	
	@Override 
	public String toString() {
		return "Acc. " + "#" + idNum + " has " + "$" + balance; 
	    // should return the string "Acct. #3 has $50.0" for an account with idNum = 3 and balance = 50
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public double withdraw(double amount){
		if(balance < amount) {
			amount = balance;
			balance = 0;
			return amount;
			
		}else {
			balance -= amount;
			return amount;
		}
		
	
	}
	
}
