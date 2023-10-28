/*1. Write a selection sort function to sort array and returns no of comparisions.*/

package assignment2;

import java.util.Arrays;

public class Assignmentq1 {
	public static void selectionsort(int[] arr, int size) {
		int count = 0;
		int pass=0;
		for (int i = 0; i < size - 1; i++) {
			pass ++;
			for (int j = i + 1; j < size; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			

		}
		System.out.println("total no of iteration=" + count);
		System.out.println("no of pass="+pass);

	}

	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		System.out.println("array before sort=" + Arrays.toString(arr));
		selectionsort(arr, arr.length);
		System.out.println("arrays after sort=" + Arrays.toString(arr));

	}
}
