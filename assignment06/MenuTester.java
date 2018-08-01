package assignment06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenuTester {
	
	
	MComp a1 = MCompTester.makeTest();
	
		

	//Test for longest
	@Test
	void test() {
		assertEquals(62, MCompTester.longestDescr(a1).getDescription().length());
	}
	
	//Test for most expensive
	@Test
	void test2() {
		assertEquals(4.29, MCompTester.dearest(a1).getPrice());
	}
	
	//Test for cheapest
	@Test
	void test3() {
		assertEquals(1.59, MCompTester.cheapest(a1).getPrice());
	}
}
