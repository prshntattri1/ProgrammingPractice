package sortingAlgorithms;

public class Heap {

	public void sort(int[] A) {
		int n = A.length;
		for (int i = (n / 2) - 1; i >= 0; i--)
			heapify(A, n, i);
		for (int i = n - 1; i >= 0; i--) {
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			heapify(A, i, 0);
		}
	}

	public void heapify(int[] A, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && A[l] > A[largest])
			largest = l;
		if (r < n && A[r] > A[largest])
			largest = r;
		if (largest != i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			heapify(A, n, largest);
		}
	}
}
