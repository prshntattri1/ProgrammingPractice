package sortingAlgorithms;

public class Counting {
	public void sort(int[] A) {
		int range = 10;
		int[] temp = new int[A.length];
		int count[] = new int[range]; // RangeofNumbers
		for (int i = 0; i < A.length; i++)
			++count[A[i]];
		for (int i = 1; i < range; i++)
			count[i] += count[i - 1];
		for (int i = 0; i < A.length; i++) {
			temp[count[A[i]] - 1] = A[i];
			--count[A[i]];
		}

		for (int i = 0; i < A.length; i++)
			A[i] = temp[i];
	}
}
