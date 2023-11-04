package assignment3;

import java.util.Scanner;
import java.util.Stack;

public class StackmaxElement {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		Stack<Integer>maxstack=new Stack<>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++);
		int input=s.nextInt();
		switch(input) {
		case 1:
			int x=s.nextInt();
			stack.push(x);
			if(maxstack.isEmpty() || x>=maxstack.peek()) {
				maxstack.push(x);
			}
			break;
		case 2:
			int popv1=stack.pop();
			if(popv1 == maxstack.peek()) {
				maxstack.pop();
			}
			break;
			
		case 3:
			System.out.println(maxstack.peek());
		    break;
		 default:break;
		}
	}
		    
		
			
			
		
		
		
		
		
		
		
		

	}


