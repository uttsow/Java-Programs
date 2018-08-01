package lab08;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RecursionTester {

	//Tests for factorial
	@Test
	public void factorialTest1() {
		assertEquals(1, Recursion.factorial(1));
	}
	
	@Test
	public void factorialTest2() {
		assertEquals(2, Recursion.factorial(2));
	}
	
	@Test
	public void factorialTest3() {
		assertEquals(6, Recursion.factorial(3));
	}
	
	//testing base case
	@Test
	public void sqrtTest() {
		assertEquals(0, Recursion.squareRoot(0), 1e-6);
	}
	
	@Test
	public void sqrtTest2() {
		assertEquals(Math.sqrt(25), Recursion.squareRoot(25), 1e-6);
	}

	@Test
	public void arrListSumTest() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		assertEquals(6, Recursion.sum(list));
	}
	@Test
	public void arrSumTest() {
		int[] list2 = {1,2,3};
		assertEquals(6, Recursion.sum(list2));
	}
	
	//k < n/2
	@Test
	public void binomailTest() {
		assertEquals(120, Recursion.binomialCoefficient(10, 3));
	}
	
	// k > n/2
	@Test
	public void binomailTest2() {
		assertEquals(120, Recursion.binomialCoefficient(10, 7));
	}
}
