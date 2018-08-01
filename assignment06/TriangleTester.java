package assignment06;

import java.util.ArrayList;
import java.util.Collections;
import assignment06.TriangleClassifier.Triple;
import static assignment06.TriangleClassifier.createTriple;
import static assignment06.TriangleClassifier.removeScalene;

public class TriangleTester {
	
	public static void main(String[] args) {
		ArrayList<Triple> t1 = new ArrayList<>();
		
		//Obtuse angle scalene
		Triple ex1 = createTriple(3,4,2);
		//Acute Iso
		Triple ex2 = createTriple(2,6,6);
		//Equi
		Triple ex3 = createTriple(3,3,3);
		//Right angle scalene
		Triple ex4 = createTriple(3,4,5);
		//Obtuse Iso
		Triple ex5 = createTriple(4,4,7);
		//Acute scalene
		Triple ex6 = createTriple(4,5,6);
		
		t1.add(ex1);
		t1.add(ex2);
		t1.add(ex3);
		t1.add(ex4);
		t1.add(ex5);
		t1.add(ex6);
		
		System.out.println(t1);
		
		Collections.sort(t1);
		System.out.println("Sorted List: "+"\n" + t1);
		
		removeScalene(t1);
		System.out.println("After removal of Scalene: " +"\n" + t1);
	}
	

}
