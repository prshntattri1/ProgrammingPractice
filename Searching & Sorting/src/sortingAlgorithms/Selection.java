package sortingAlgorithms;

public class Selection {

	public static void sort(int[] A) {
		int i, j, min;
		for (i = 0; i < A.length - 1; i++) {
			min = i;
			for (j = i + 1; j < A.length; j++) {
				if (A[j] < A[min])
					min = j;
			}
			int temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
	}
}
