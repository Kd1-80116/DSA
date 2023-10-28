package assignment2;

import java.util.Scanner;

public class assignmentq7 {
	public static void main(String[] args) {
		Queue q=new Queue(4);
		Scanner s=new Scanner(System.in);
		int choice;
		do {
				System.out.println("0.Exit\n1.push\n2.pop\n3.peek");
				System.out.println("enter ur choice");
			     choice=s.nextInt();
			    switch(choice) {
			    case 1:// push element into queue
			    	if(q.isfull()) 
			    		System.out.println("queue is full");
			    	
			    	else
			    	{
			    		System.out.print("enter element: ");
			    		Scanner p=new Scanner(System.in);
			    		int data=p.nextInt();
			    		q.push(data);
			    	}
			    	break;
			    	
			    case 2: // pop element from queue
			    	if(q.isEmpty()) 
			    		
			    		System.out.println("queue is already empty");
			    	
			    	else
			    		q.pop();
			    	break;
			    
			    case 3: //peek element from queue
			    	if(q.isEmpty()) 
			    		System.out.println("queue is alerady empty");
			    	
			    	else {
			    		System.out.println("peek element="+q.peek());
			    	}
			      break;    
		    }
		}while(choice !=0);
		
		
		
	}

}
