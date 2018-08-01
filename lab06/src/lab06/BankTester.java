package lab06;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankTester {
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	ArrayList<Object> objects;
	//we can initialize some objects to be used in later tests
	//using the Before keyword ensures this method is called before 
	//the test methods are called
	
	//Please note that this method is rerun before the start of each test,
	//which means the BankAccounts will have their numId's increased 
	//each time the account is called.
	
	//we will fix this issue by adding an @After method, which is run 
	//after each test ends
	@Before
	public void initialize(){
		BankAccount uttsowAcc = new BankAccount(1000);
		BankAccount uttsowSaving = new SavingsAccount(100, .01);
		BankAccount uttsowChecking = new CheckingAccount(100, 5);
		
		BankAccount johnAcc = new BankAccount(2000);
		BankAccount johnSaving = new SavingsAccount(100, .02);
		BankAccount johnChecking = new CheckingAccount(100, 10);
		
		accounts.add(uttsowAcc);
		accounts.add(uttsowSaving);
		accounts.add(uttsowChecking);
		accounts.add(johnAcc);
		accounts.add(johnSaving);
		accounts.add(johnChecking);
		
		objects = new ArrayList<Object>();
		objects.add("Hello World");
		objects.add(false);
		objects.add(1);
		objects.add(uttsowAcc);
		int[] e1 = {1,2,3};
		objects.add(Arrays.toString(e1));
		objects.add('A');
		objects.add(johnAcc);
		ArrayList<Integer> e2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		objects.add(e2);
		
		
		
		
		
		
		
	}

	@After 
	public void resetIdNum(){
		BankAccount.reset();
	}
	
	
	//the @Test is necessary, without it the test will not be run
	@Test
	public void testBankAccDeposit() {
		BankAccount bacc = new BankAccount(700.00);
		bacc.deposit(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(800.00, bacc.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("BankAccount's deposit() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testCheckingAccWithdraw(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(700.00, checking.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's withdraw() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testCheckingAccGetWithdrawCount(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two integers, we don't need a third argument 
			//since ints can be checked for equality
			assertEquals(3, checking.getwithdrawCount());
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's getWithdrawCount() method failed: " + e.getMessage());
			System.out.println("Make sure you adjust the withdrawCount in your CheckingAccount's withdraw() method!");
			throw e;
		}
	}
	@Test
	public void depositAmount() {
		
		int w = 0;
		for(BankAccount i : accounts) {
			i.deposit(100);
			
		try {
			//System.out.println(accounts.get(2));
			assertEquals(i.toString(), accounts.get(w).toString());
		}
		catch(AssertionError e) {
			System.out.println("Output does not match");
			throw e;
		}
		w++;
		}
	}
		
	@Test
	public void withdrawCheck() {
		BankAccount q1 = new CheckingAccount(1000, 5);
		BankAccount q2 = new CheckingAccount(1000, 10);
		for(int i = 0; i < 4; i++) {
			q1.withdraw(100.0);
			System.out.println(q1);
		}
		for(int i = 0; i<11; i++) {
			q2.withdraw(1);
		}
		System.out.println("Withdraw Check for CheckingAccount");
		System.out.println(q2);
		
		
	}
	
	//TODO: Add some of your own additional tests. Keep each test in a separate test function.
	//This isolates testing a single method or case to a single testing method. Otherwise, 
	//if you try to do too much testing in one tester method, you could throw an error
	//for a test and never find the errors of the other tests you put in that method. 
	@Test
	public void dynamicDispatchPrinting(){
		System.out.println("Account ArrayList: ");
		System.out.println(accounts);
		System.out.println("Object ArrayList:");
		System.out.println(objects);
	}

}
