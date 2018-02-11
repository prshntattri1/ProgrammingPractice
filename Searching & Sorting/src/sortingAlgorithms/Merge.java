package sortingAlgorithms;

public class Merge {

	public static void sort(int[] A) {
		Merge m = new Merge();
		m.mergeSort(A, 0, A.length - 1);
	}

	public void mergeSort(int[] A, int left, int right) {
		int mid;
		if (left < right) {
			mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid + 1, right);
			merge(A, left, mid, right);
		}
	}

	public void merge(int[] A, int left, int mid, int right) {
		int s1 = mid - left + 1;
		int s2 = right - mid;

		int[] L = new int[s1];
		int[] R = new int[s2];

		for (int i = 0; i < s1; ++i)
			L[i] = A[left + i];
		for (int j = 0; j < s2; ++j)
			R[j] = A[mid + 1 + j];

		int i = 0, j = 0, k = left;
		while (i < s1 && j < s2) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < s1) {
			A[k] = L[i];
			i++;
			k++;
		}
		while (j < s2) {
			A[k] = R[j];
			j++;
			k++;
		}
	}
}
