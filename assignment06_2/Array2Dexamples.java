package assignment06_2;

import java.util.Arrays;

public class Array2Dexamples {

	/**
	 * Returns an array where the i-th element is the sum of the elements in the
	 * i-th row of arr.
	 * 
	 * @param arr
	 *            possibly ragged array of ints
	 * @return the sums of each row in a 1-dimensional array
	 */
	public static int[] rowSums(int[][] arr) {
		// sets the size of the new total int[];
		int[] total = new int[arr.length];
		// length of the number of rows
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // every new row will start with sum 0;
			for (int j = 0; j < arr[i].length; j++) { // size of each row (1st row is 4 for ex);
				sum += arr[i][j];
				total[i] = sum;
			}
		}
		return total;
	}

	/**
	 * Returns an array where the i-th element is the sum of the elements in the
	 * i-th column of arr. The length of the return array is the maximum length of
	 * any row of arr. The sum for the i-th column only includes elements from rows
	 * that have an element in the i-th column.
	 * 
	 * @param arr
	 *            possibly ragged array of ints
	 * @return the sums of the columns in a 1-dimensional array
	 */
	public static int[] columnSums(int[][] arr) {

		int[] total = {};
		int max = 0;

		for (int a = 0; a < arr.length; a++) {
			if (arr[a].length > max) {
				total = new int[arr[a].length];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total[j] += arr[i][j];

			}
		}
		return total;
	}

	/**
	 * Returns an array where the i-th element is the average of the elements in the
	 * i-th row of arr. If a row is an empty array, the average is 0.
	 * 
	 * @param arr
	 *            possibly ragged array of ints
	 * @return the averages of each row in a 1-dimensional array
	 */
	public static double[] rowAverages(int[][] arr) {

		double total[] = new double[arr.length];
		double totalAverage[] = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total[i] += arr[i][j];
			}
			totalAverage[i] = (total[i] / arr[i].length);
		}
		return total;
	}

	/**
	 * Returns an array where the i-th element is the average of the elements in the
	 * i-th column of arr. The length of the return array is the maximum length of
	 * any row of arr. The average for the i-th column only includes elements from
	 * rows that have an element in the i-th column. You must get the sum and the
	 * count of the elements that appear in the i-th column in order to take the
	 * average.
	 * 
	 * @param arr
	 *            possibly ragged array of ints
	 * @return the averages of each columns in a 1-dimensional array
	 */
	public static double[] columnAverages(int[][] arr) {
		double[] total = {};
		double[] tracker = {};
		int max = 0;
		double[] colArr = {};

		for (int a = 0; a < arr.length; a++) {
			if (arr[a].length > max) {
				total = new double[arr[a].length];
				colArr = new double[arr[a].length];
				tracker = new double[arr[a].length];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total[j] += arr[i][j];
				tracker[j]++; 	//keeps track of the number of elements
			}
		}

		
		

		// getting the Average
		for (int o = 0; o < total.length; o++) {
			colArr[o] = total[o] / tracker[o];
		}

		return colArr;

	}

	/**
	 * Returns the sum of the elements on the main diagonal: arr[0][0], arr[1][1],
	 * arr[2][2], ... arr[n][n], where n = arr/length - 1.
	 * 
	 * @param arr
	 *            a square array of int
	 * @return the sum of the elements on the main diagonal
	 * @throws IllegalArgumentException
	 *             if arr is null or if any row is null or has a length different
	 *             from the number of rows
	 */
	public static int diagonalSum(int[][] arr) {
		int totalSum = 0;
		int columnTracker = 0;
		if (arr == null) {
			throw new IllegalArgumentException("Cant have null array");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null || arr.length != arr[i].length) {
				throw new IllegalArgumentException("Cant have different length rows or null rows");
			}

			totalSum += arr[i][columnTracker];
			columnTracker++;

		}
		return totalSum;
	}

	/**
	 * Returns the sum of the elements on the main anti-diagonal:
	 * arr[n][0], arr[n-1][1], arr[n-2][2], ... arr[0][n], 
	 * where n = arr/length - 1. 
	 * @param arr a square array of int
	 * @return the sum of the elements on the main anti-diagonal
	 * @throws IllegalArgumentException if arr is null or if
	 * any row is null or has a length different from the number of rows
	 */
	public static int antiDiagonalSum(int[][] arr) {
		if(arr == null) throw new IllegalArgumentException ("Cant have null Array");
		int sum = 0;
		int n = arr.length -1;
		
		
		
		for(int x = 0; x<arr.length; x++) {
			if(arr[x] == null || arr.length != arr[x].length) 
				throw new IllegalArgumentException("Cant have null rows or different row lengths");
			sum += arr[n][x];
			n--;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] test = {{1,7,2,4}, {3,5}, {4,0,2,1,4}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {{1,7,2,4}, {3,5,6,1}, {5,5,1,1}, {4,0,2,1,}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {{}, {}, {}, {}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {{1,7,2,4}, {}, {4,0,2,1,4}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {{}, {}, {4,0,2,1,4}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = new int[][] {{0}, {}, {0,0}};
		System.out.println(Arrays.toString(rowSums(test)));		
		System.out.println(Arrays.toString(columnSums(test)));
		System.out.println(Arrays.toString(rowAverages(test)));
		System.out.println(Arrays.toString(columnAverages(test)));
		test = null;
		try {
			diagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got diagonal exception 1 OK for null");
		}
		try {
			antiDiagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got antidiagonal exception 2 OK for null");
		}
		test = new int[][] {{1,7,2,4}, null, {4,0,2,1,4}};
		try {
			diagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got diagonal exception 3 OK for null");
		}
		try {
			antiDiagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got antidiagonal exception 4 OK for null");
		}
		test = new int[][] {{1,7,2}, {1,7,2}, {4,0,2,1,4}};
		try {
			diagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got diagonal exception 5 OK for null");
		}
		try {
			antiDiagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got antidiagonal exception 6 OK for null");
		}
		test = new int[][] {{1,7,2}, {1,7}, {4,0,2}};
		try {
			diagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got diagonal exception 7 OK for null");
		}
		try {
			antiDiagonalSum(test);
		} catch(IllegalArgumentException e) {
			System.out.println("got antidiagonal exception 8 OK for null");
		}
		test = new int[][] {{1,7,2,4}, {3,5,6,1}, {5,5,1,1}, {4,0,2,1,}};
		System.out.println(antiDiagonalSum(test));
		System.out.println(diagonalSum(test));
	}
}
