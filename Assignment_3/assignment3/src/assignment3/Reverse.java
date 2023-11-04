package assignment3;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Stack<Integer>st=new Stack<>();
		for(int index=0;index<n;index++) {
			st.push(s.nextInt());
			
		}
		for(int index=0;index<n;index++) {
			System.out.println(st.pop()+" ");
		}

	}

}
