package searchingoperation;

import java.util.Scanner;

public class linearserch {
	public static int linear_search(int arr[], int size, int key) {
		int comp = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				comp++;

				return comp;

			}

			comp++;
		}
		System.out.println("Key Found " + key);
		return comp;

	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Key You Want To Find");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);

		System.out.println("Number Of Comperison " + index);

	}


	
	
	
	

	
		

	}


