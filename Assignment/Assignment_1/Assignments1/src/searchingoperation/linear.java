package searchingoperation;

import java.util.Scanner;

public class linear {
	public static int linear_search(int arr[],int size,int key) {
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Occurrence");
		int occ=sc.nextInt();
		for(int i=0;i<size;i++) {
		
			if(arr[i]==key) {
				cnt++;
				if(cnt==occ) 
				{
					return i;
				}
				
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 10,20,15,3,4,4,1 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Key You Want To Find");
		int key = sc.nextInt();
		
		
		
		int index = linear_search(arr, arr.length, key);
		

		System.out.println("Number Of Comperison " + index);

	}
}


