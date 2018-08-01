package assignment07;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.stream.Stream;

public class P19_2 {

	
	public static boolean palindrome(BigInteger n) {
		String value = "" + n;

		StringBuilder build = new StringBuilder(value);
		build.reverse();
		
		if (value.equals(build.toString())) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) throws FileNotFoundException {
		
		try (PrintWriter output = new PrintWriter("test3.txt")) {
			Stream.iterate(BigInteger.ONE, w -> w.add(BigInteger.ONE))
				.map(w -> w.pow(2))
				.filter(P19_2 :: palindrome)
				.limit(50)
				.forEach(output :: println);
			}  
}

}
