package searchingoperation;

import java.util.Scanner;

public class BinareySearch {
	public static int binary_search(int arr[], int size, int key) {
		// Arrays.sort(arr);
		int left = 0;
		int right = size - 1;
		int mid;
		int comp = 0;

		while (left <= right) {
			comp++;
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return comp;

			} else if (key < arr[mid]) {

				right = mid - 1;

			}

			else
				left = mid + 1;

		}
		// System.out.println("Number Of Comparison"+comp);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Key You Want To Search");
		int key = sc.nextInt();

		int index = binary_search(arr, arr.length - 1, key);

		if (index != -1)
			System.out.println("Number Of Comparison " + index);
		else
			System.out.println("Element Not Found");
		sc.close();

	}



	 {

	}

}
