package searchingoperation;

import java.util.Scanner;

public class Rank {
public static int rank_search(int arr[],int size,int key) {
		int cnt=0;
		for(int i=0;i<size;i++) {
		
			if(key==arr[i]) {
				System.out.println("in if");
				cnt++;
			}
				return cnt;
		}
	 return -1;
	}

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Key You Want to Search");
		int key=new Scanner(System.in).nextInt();
		
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		
		int index=rank_search(arr,arr.length,key);
		System.out.println("Ranak of "+key+" is "+index);
	}
}


