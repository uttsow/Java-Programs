package lab08;
import java.util.ArrayList;

public class Recursion {
	private static final double DELTA = 1e-6;
	
	public static int factorial(int n){
		if(n<0) throw new IllegalArgumentException("Cant calculate "
				+ "the factorial of negitave value.");
		if(n == 0 || n == 1) return 1;
		if(n == 2) return 2;
		return n * factorial(n-1);
	}
	//Accumalator (Method overloading)
	public static double squareRoot(double n){
		if(n<0) throw new IllegalArgumentException("Cant have negative number");
		
		return squareRootHelper(n, n/2);
	}
	
	
	private static double squareRootHelper(double n, double approx){
		if(n == 0) return 0;
		if(n==1) return 1;
		if(Math.abs((Math.pow(approx, 2))-n)< DELTA) return approx;
		else{
			return squareRootHelper(n,(approx + n/approx) / 2);
		}
	}
	
	//Recursion with lists;
	public static int sum(ArrayList<Integer> nums){

		return sumHelper(nums, 0);
	}
	
	private static int sumHelper(ArrayList<Integer> nums, int index){
		
		if(nums.size() == 0) return 0;
		if(nums.size() == 1) return nums.get(index);
		if(nums.size() - 1 ==  index) return nums.get(index);
		return (nums.get(index)+ sumHelper(nums, index + 1));
	}
	
	
	public static int sum(int[] nums){
		return sumHelper(nums, 0);
	}
	
	private static int sumHelper(int[] nums, int index){
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[index];
		if(nums.length -1 == index) return nums[index];
		return (nums[index] + sumHelper(nums, index +1));
	}
	
	public static int binomialCoefficient(int n, int k){
		if(k ==n || k == 0) return 1;
		if(k > n/2) return binomialCoefficient(n, n-k); 
		return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
	}
	
}
