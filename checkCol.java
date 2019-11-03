import java.util.Arrays;

public class checkCol {
	int col;
	int array[][];
	static int arrayCheck[] = {1,2,3,4,5,6,7,8,9};
	
	public checkCol(int col, int array[][]) {
		this.col = col;
		this.array = array;
		}
	public Boolean run() {
		int temp[] = {0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < 9; i++) {
			temp[i] = array[i][col];
		}
		return confirm(temp);
	}
	public static Boolean confirm(int array[]) {
		Arrays.sort(array);
		if(Arrays.equals(array, arrayCheck)) {
			return true;
		}
		else {
			return false;
		}
	}
}
