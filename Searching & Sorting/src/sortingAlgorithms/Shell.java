package sortingAlgorithms;

public class Shell {

	public static void sort(int[] A) {
		for (int gap = A.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < A.length; i += 1) {
				int temp = A[i];
				int j = i;
				for (; j >= gap && A[j - gap] > temp; j -= gap)
					A[j] = A[j - gap];
				A[j] = temp;
			}
		}

	}
}
