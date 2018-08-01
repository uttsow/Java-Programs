package lab06;

public class SavingsAccount extends BankAccount{
	private double rate;
	
	
	public SavingsAccount(double aBalance, double aRate){
		super(aBalance);
		rate = aRate;
	}
	@Override
	public void deposit(double amount){
		super.deposit((amount) + (rate * amount));
	}
	
	public double getRate(){
		return rate;
	}
	
	@Override
	public String toString(){
		return super.toString() + " @ " + rate + "%"; 
	}
	
}
