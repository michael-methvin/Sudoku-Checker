
public class main {
	public static void main(String[] args) {
		int array[][] = new int[][] { {4,3,5,2,6,9,7,8,1},
									  {6,8,2,5,7,1,4,9,3},
									  {1,9,7,8,3,4,5,6,2},
					                  {8,2,6,1,9,5,3,4,7},
					                  {3,7,4,6,8,2,9,1,5},
					                  {9,5,1,7,4,3,6,2,8},
					                  {5,1,9,3,2,6,8,7,4},
					                  {2,4,8,9,5,7,1,3,6},
					                  {7,6,3,4,1,8,2,5,9} };
				
	checkRows a = new checkRows(array);
	checkCols b = new checkCols(array);
	checkArrays c = new checkArrays(array);
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(b);
	Thread t3 = new Thread(c);
	t1.start();
	t2.start();
	t3.start();
	
	}
}
