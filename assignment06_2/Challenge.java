package assignment06_2;



public class Challenge {
	private int[][] array;
	private int[] colSums;
	private int[] rowSums;
	private int diagSum;
	private int antiDiagSum;

	class Pair {
		int row;
		int col;

		public Pair(int x, int y) {
			row = x;
			col = y;
		}

		public String toString() {
			return row + ", " + col;
		}
	}

	public Challenge(int[][] array, int[] colSums, int[] rowSums, int diagSum, int antidiagSum) {
		this.array = array;
		this.colSums = colSums;
		this.rowSums = rowSums;
		this.diagSum = diagSum;
		this.antiDiagSum = antidiagSum;
	}

	public String view(int[][] arr) {

		String newArray = "";

		// sets up antiDiagnal;
		for (int i = 0; i < arr.length; i++) {
			newArray += ("\t");
		}
		newArray += antiDiagSum + "\n";

		// Sets up the actual array and row sums
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArray = newArray + "" + (arr[i][j] + "\t");
				if (j == arr[i].length - 1) {
					newArray = newArray + "" + (rowSums[i]);
				}
			}
			newArray += "\n";
		}
		// sets up colum sums and diag;
		for (int x = 0; x < colSums.length; x++) {
			newArray = newArray + "" + colSums[x] + "\t";
			if (x == colSums.length - 1) {
				newArray += diagSum;
			}
		}

		return newArray;
	}

	public int countZeros(int[][] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					counter++;
				}
			}
		}
		return counter;
	}

	public Pair nextZero(int[][] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				if (arr[x][y] == 0)
					return new Pair(x, y);
			}
		}
		return null;
	}

	public boolean feasible(int[][] arr) {
		if(Array2Dexamples.antiDiagonalSum(arr) > antiDiagSum || Array2Dexamples.diagonalSum(arr) > diagSum)
			return false;
		else {
			for(int i = 0; i< 4; i++) {
				if(Array2Dexamples.rowSums(arr)[i] > rowSums[i] || Array2Dexamples.columnSums(arr)[i] > colSums[i])
					return false;
			}
		}
		return true;
	}
	
	public boolean solved(int[][] arr) {
		if(Array2Dexamples.antiDiagonalSum(arr) != antiDiagSum || Array2Dexamples.diagonalSum(arr) != diagSum)
			return false;
		else {
			for(int i = 0; i< 4; i++) {
				if(Array2Dexamples.rowSums(arr)[i] != rowSums[i] || Array2Dexamples.columnSums(arr)[i] != colSums[i])
					return false;
			}
		}
		return true;
	}

	private int[][] duplicate(int[][] arr) {
		int[][] duplicateArr = new int[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				duplicateArr[i][j] = arr[i][j];
			}

		}
		return duplicateArr;
	}

	public void solve(int[][] arr) {
		Pair p;
		if(countZeros(arr) > 0) {
			 p = nextZero(arr);
			for(int i = 1; i <= 9; i++) {
				arr[p.row][p.col] = i;
				//Return true when solution is met
				if(countZeros(arr) == 0 && solved(arr)) {
					System.out.println("\nSOLUTION\n" + view(arr));
				}
				//recursion
				if(countZeros(arr) > 0 && feasible(arr)) {
					solve(duplicate(arr));
				}
			}
		}
	}


	

	public static void main(String[] args) {
		Challenge puzzle = new Challenge(new int[][]{{2,0,0,0},{0,0,0,1},{0,5,0,0},{0,0,6,0}},
				new int[]{8,9,15,28}, new int[]{15,11,17,17}, 14, 20);
		System.out.println(puzzle.view(puzzle.array));
		puzzle.solve(puzzle.duplicate(puzzle.array));
	}
}
