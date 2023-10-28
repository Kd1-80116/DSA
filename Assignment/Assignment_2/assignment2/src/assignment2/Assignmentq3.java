package assignment2;

import java.util.Arrays;

public class Assignmentq3 {
	
	public static void inserationsort(int[]arr,int size) {
		int count=0;
		int pass=0;
		for(int i=1;i<size;i++) {
			pass ++;
			
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				count ++;
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
			
			
			
		}
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		int []arr= {55,44,22,66,11,33};
		System.out.println("array before inseration"+Arrays.toString(arr));
		System.out.println(arr.length);
		inserationsort(arr,arr.length);
		System.out.println("arrys after insertion sort"+Arrays.toString(arr));
		
		

	

}
}
