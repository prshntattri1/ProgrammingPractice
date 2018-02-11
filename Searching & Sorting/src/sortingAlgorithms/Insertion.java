package sortingAlgorithms;

public class Insertion {

	public static void sort(int[] A) {
		int i, j, v;
		for (i = 1; i <= A.length - 1; i++) {
			v = A[i];
			j = i;
			while (j >= 1 && A[j - 1] > v) {
				A[j] = A[j - 1];
				j--;
			}
			A[j] = v;
		}
	}
}
