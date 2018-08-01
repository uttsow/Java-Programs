package assignment07;

import java.io.PrintWriter;
import java.util.Random;
import java.util.stream.LongStream;

public class P19_1 {

	public static void main(String[] args) {

		int k = 10;

		Random generator = new Random();

		LongStream storage;
		Long count;
		
		for (int i = 0; i < 8; i++) {
			storage = generator.longs(0, k);

			long t1 = System.currentTimeMillis();
			count = storage
					.parallel()
					.filter(w -> w % 2 != 0)
					.limit(k)
					.count();

			long t2 = System.currentTimeMillis();
			System.out.println(count + ": " + (t2 - t1));
			k = k * 10;
			// storage.forEach(s ->System.out.println(s + " "));
		}

		// (i) filter to remove even numbers using a lambda expression that is true if
		// the number is odd,
		// (ii) limit the stream to k elements,
		// (iii) apply the count() operation.
	}

}
