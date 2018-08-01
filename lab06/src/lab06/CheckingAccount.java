package lab06;

public class CheckingAccount extends BankAccount {
	private int withdrawLimit;
	private int withdrawCount = 0;
	
	public CheckingAccount(double balance, int aLimit){
		super(balance);
		withdrawLimit = aLimit;
	}
	
	public int getwithdrawLimit(){
		return withdrawLimit;
	}
	public int getwithdrawCount(){
		return withdrawCount;
	}
	
	@Override
	public String toString(){
		return super.toString() + "(" + withdrawCount + "/" + 
				withdrawLimit + ")";
	}
	
	@Override
	public double withdraw(double amount){
		if(withdrawCount < withdrawLimit){
			 super.withdraw(amount);	
			 withdrawCount++;
		}
		if(withdrawCount >= withdrawLimit){
			amount = 0;
		}
		return amount; 

	}
}
