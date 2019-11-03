import java.util.Arrays;

public class checkArray {
int array[][];
static int arrayCheck[] = {1,2,3,4,5,6,7,8,9};

public checkArray(int array[][]) {
	this.array = array;
}
public Boolean run() {
	int temp[] = {0,0,0,0,0,0,0,0,0};
	int k = 0;
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			temp[k] = array[i][j];
			k++;
		}
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
