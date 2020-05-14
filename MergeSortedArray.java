public class MergeSortedArray {
	public static void main(String args[]) {
		int arr1[] = { 1, 3, 4, 5 };
		int arr2[] = { 2, 4, 6, 8 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		int res[] = new int[len1 + len2];
		MergeSortedArray.mergeArray(arr1, arr2, len1, len2, res);
		for (int i = 0; i < len1 + len2; i++)
			System.out.print(res[i] + " ");

	}

	static int[] mergeArray(int arr1[], int arr2[], int len1, int len2,
			int res[]) {

		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];

			} else {
				res[k++] = arr2[j++];

			}
		}
		while (i < len1) {
			res[k++] = arr1[i++];

		}
		while (j < len2) {
			res[k++] = arr2[j++];
		}
		return res;
	}

}
