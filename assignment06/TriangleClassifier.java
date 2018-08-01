package assignment06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TriangleClassifier {
	
	//nested static class;
	public static class Triple implements Comparable<Triple>{
		private int a;
		private int b;
		private int c;
		
		public String toString() {
			return classify(a,b,c);
		}

		@Override
		public int compareTo(Triple arg0) {
			return number.get(toString()) - number.get(arg0.toString());
		}
		
	}
	
	//creates triple and returns the instance
	public static Triple createTriple(int a, int b, int c) {
		Triple tri = new Triple();
		tri.a = a;
		tri.b = b;
		tri.c = c;
		return tri;
	}
	
	public static void removeScalene (ArrayList<Triple> list) {
		Iterator<Triple> iter = list.iterator();
		while(iter.hasNext()) {
			Triple t = iter.next();
			if(t.toString().contains("Scalene"))  iter.remove();
		}
	}
	
	
	
	private static String[] triDesc = {"Equilateral Triangle", "Acute-angled Isosceles Triangle", "Obtuse-angled Isosceles Triangle", "Acute-angled Scalene Triangle", "Right-angled Scalene Triangle", "Obtuse-angled Scalene Triangle"};
	private static Map<String, Integer> number = new HashMap<String, Integer>();
	
	//Populate the hashmap;
	static {
		for(int i = 0; i<triDesc.length; i++) {
			number.put(triDesc[i], i);
		}
	}
	
	public static String classify(int a, int b, int c) {
		String retVal = "";
		if(a == 0 || b == 0 || c == 0 || a < 0|| b < 0 || c < 0 || a >= b+c || b >= a+c || c >= a+b) throw new IllegalArgumentException("Invalid Triangle (" + a + ", " + b + ", " + c + ")");
		
		//Equilateral Triangle;
		if(a == b && a == c && b == c) {
			retVal = triDesc[0];
		}else if
		//Acute angle Iso
		((a == c && b*b < c*c + a*a) || (a==b && c*c < a*a + b*b) || (b==c && a*a < b*b + c*c)) {retVal = triDesc[1];}
	
		//Obtuse Iso
		else if((a == c && b*b > c*c + a*a) || (a==b && c*c > a*a + b*b) || (b==c && a*a > b*b + c*c)) { retVal = triDesc[2];}
		
		//Acute Scalene
		else if((a*a < b*b + c*c && b*b < c*c + a*a && c*c < a*a + b*b)) {retVal = triDesc[3];}
	
		//Right-angle scalene
		else if((a*a + b*b  == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b)) { retVal= triDesc[4];}
		
		else { retVal = triDesc[5];}
		
		return retVal;
	}
	
	
	

}
