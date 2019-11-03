
public class checkCols implements Runnable {
	int array[][];
	Boolean allTrue = false;
	public checkCols(int array[][]) {
		this.array = array;
	}
	public void run() {
		checkCol col0 = new checkCol(0, array);
		checkCol col1 = new checkCol(1, array);
		checkCol col2 = new checkCol(2, array);
		checkCol col3 = new checkCol(3, array);
		checkCol col4 = new checkCol(4, array);
		checkCol col5 = new checkCol(5, array);
		checkCol col6 = new checkCol(6, array);
		checkCol col7 = new checkCol(7, array);
		checkCol col8 = new checkCol(8, array);
		if(col0.run() && col1.run() &&  col2.run() && col3.run() && col4.run() && col5.run() && col6.run() && col7.run() && col8.run()) {
			allTrue = true;
			System.out.println("Columns work!");
		}
		else {
			allTrue = false;
			System.out.println("Error with columns!");
		}
	}
}
