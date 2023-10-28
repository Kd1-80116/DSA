package searchingoperation;

public class Nonrep {
	public static int non_rep(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<n;j++) 
				
				if(i!=j && arr[i]==arr[j]) 
					break;
				
				if(j==n) 
					return arr[i];	
			
		
		
	}
		return -1;
}
	
	public static void main(String[]args) {
		int arr[]={1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int n=arr.length;
		
		int index= non_rep(arr,n);
		System.out.print("Non Repeating Element = "+non_rep(arr,n));
	}
}


