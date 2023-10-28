/* Write a bubble sort function to sort array and returns no of comparisions.*/



package assignment2;

import java.util.Arrays;

public class Asssignmentq2 {
	
	public static void bubblesort(int[]arr,int size) {
		int count=0;
		int pass=0;
		for(int i=1;i<size;i++)	{
			pass ++;
			
			
		for(int j=0;j<size-i;j++) {
			count ++;
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				
			}
			
		}
		
			
			
		}
		System.out.println("no of comparision="+count);
		System.out.println("no of pass="+pass);
		
		
		
		
	}

	public static void main(String[] args) {
		int[]arr= {33,22,66,55,44,11};
		System.out.println("array befor sort"+Arrays.toString(arr));
		bubblesort(arr,arr.length);
		System.out.println("arrays after sort="+Arrays.toString(arr));

	

}
}
