package sortingAlgorithms;

public class Bubble {

	public static void sort(int[] A) {
		int pass, i;
		boolean swapped = true;
		for (pass = A.length - 1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for (i = 0; i <= pass - 1; i++) {
				if (A[i] > A[i + 1]) {
					A[i] = A[i] + A[i + 1];
					A[i + 1] = A[i] - A[i + 1];
					A[i] = A[i] - A[i + 1];
					swapped = true;
				}
			}
		}
	}
}
