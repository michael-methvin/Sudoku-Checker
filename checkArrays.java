
public class checkArrays implements Runnable {
int array[][];
int array0[][] = new int[3][3];
int array1[][] = new int[3][3];
int array2[][] = new int[3][3];
int array3[][] = new int[3][3];
int array4[][] = new int[3][3];
int array5[][] = new int[3][3];
int array6[][] = new int[3][3];
int array7[][] = new int[3][3];
int array8[][] = new int[3][3];


public checkArrays(int array[][]) {
	this.array = array;
}
public void split(int array[][]) {
	int k = -1;
	int l = 0;
	for(int i = 0; i < 3; i++) {
		k++;
		l = 0;
		for(int j = 0; j < 3; j++) {
			array0[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 0; i < 3; i++) {
		k++;
		l = 0;
		for(int j = 3; j < 6; j++) {
			array1[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 0; i < 3; i++) {
		k++;
		l = 0;
		for(int j = 6; j < 9; j++) {
			array2[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 3; i < 6; i++) {
		k++;
		l = 0;
		for(int j = 0; j < 3; j++) {
			array3[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 3; i < 6; i++) {
		k++;
		l = 0;
		for(int j = 3; j < 6; j++) {
			array4[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 3; i < 6; i++) {
		k++;
		l = 0;
		for(int j = 6; j < 9; j++) {
			array5[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 6; i < 9; i++) {
		k++;
		l = 0;
		for(int j = 0; j < 3; j++) {
			array6[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 6; i < 9; i++) {
		k++;
		l = 0;
		for(int j = 3; j < 6; j++) {
			array7[k][l] = array[i][j];
			l++;
		}
	}
	k = -1;
	l = 0;
	for(int i = 6; i < 9; i++) {
		k++;
		l = 0;
		for(int j = 6; j < 9; j++) {
			array8[k][l] = array[i][j];
			l++;
		}
	}
}
public void run() {
	split(array);
	checkArray arraya = new checkArray(array0);
	checkArray arrayb = new checkArray(array1);
	checkArray arrayc = new checkArray(array2);
	checkArray arrayd = new checkArray(array3);
	checkArray arraye = new checkArray(array4);
	checkArray arrayf = new checkArray(array5);
	checkArray arrayg = new checkArray(array6);
	checkArray arrayh = new checkArray(array7);
	checkArray arrayi = new checkArray(array8);
	
	if(arraya.run() && arrayb.run() && arrayc.run() && arrayd.run() && arraye.run() && arrayf.run() && arrayg.run() && arrayh.run() && arrayi.run()) {
		System.out.println("All sub-arrays work!");
	}
	else {
		System.out.println("Sub-arrays not working!");
	}
}

}
