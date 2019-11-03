
public class checkRows implements Runnable {
	int array[][];
	Boolean allTrue = false;
	public checkRows(int array[][]) {
		this.array = array;
	}
	public void run() {
		checkRow row0 = new checkRow(0, array);
		checkRow row1 = new checkRow(1, array);
		checkRow row2 = new checkRow(2, array);
		checkRow row3 = new checkRow(3, array);
		checkRow row4 = new checkRow(4, array);
		checkRow row5 = new checkRow(5, array);
		checkRow row6 = new checkRow(6, array);
		checkRow row7 = new checkRow(7, array);
		checkRow row8 = new checkRow(8, array);
		if(row0.run() && row1.run() &&  row2.run() && row3.run() && row4.run() && row5.run() && row6.run() && row7.run() && row8.run()) {
			allTrue = true;
			System.out.println("Rows work!");
		}
		else {
			allTrue = false;
			System.out.println("Error with rows!");
		}
	}
}
