public class CommonElementSortedArrayDemo {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 5, 9 };
		int arr3[] = { 1, 3, 4, 5, 8 };
		CommonElementSortedArrayDemo obj = new CommonElementSortedArrayDemo();
		obj.getCommonElement(arr1, arr2, arr3);
	}

	void getCommonElement(int arr1[], int arr2[], int arr3[]) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

	}
}
// [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
