package searchingoperation;

import java.util.Scanner;

public class Descbinarysearch {
	
		public static int desc_binary(int arr[],int size,int key) {
			int left=0, right=size-1,mid;
			
			while(left<=right) 
			{	
				mid=(left+right)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key< arr[mid]) {
				left=mid+1;
				
			}
			else 
				right = mid -1;
			
			}
		return -1;
		}
		
		public static void main(String[] args) {
			int arr[] = { 99,88,77,66,55,44,33,22,11 }; 

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Key You Want To Search");
			int key = sc.nextInt();

			int index = desc_binary(arr, arr.length , key);

			if (index != -1)
				System.out.println("Element Found At Index " + index);
			else
				System.out.println("Element Not Found");
			sc.close();

		}

	}


