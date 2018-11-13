
public class Model {
	private int[][] numArray;
	private int n;
	
	public Model(int n) {
		numArray = new int[n][n];
		this.n = n;
	}
	
	
	public boolean checkForWin() {
		int sum = 0;
		//calculate first row
		for (int i = 0; i < n; i++)
			sum += numArray[i][0];
			
		int compare = 0;
		//check all vertical
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				compare += numArray[i][j];
			if (compare != sum)
				return false;
			compare = 0;
		}
		//check all horizontal
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++)
				compare += numArray[i][j];
			if (compare != sum)
				return false;
			compare = 0;
		}
		
		//Diagonally starting at 0,0
		for (int i = 0, j = 0; i < n; i++ ,j++)
			compare += numArray[i][j];
		if (compare != sum)
			return false;
		compare = 0;
		
		//Diagonally starting at 0,n-1
		for (int i = 0, j = n-1; i < n; i++, j--)
			compare += numArray[i][j];
		if (compare != sum)
			return false;
		
		return true;
	}
	
	public int[][] getNumArray() {
		return numArray;
	}

	public void setNumArray(int[][] numArray) {
		this.numArray = numArray;
	}
}
