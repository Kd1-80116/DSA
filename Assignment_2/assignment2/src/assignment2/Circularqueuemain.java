package assignment2;

import java.util.Scanner;

public class Circularqueuemain {

	public static void main(String[] args) {
		Circularqueue q=new Circularqueue(4);
	  Scanner s=new Scanner(System.in);
	  int choice;
	  do {System.out.println("0.Exit\n1.push\n2.pop\n3.peek");
	     System.out.println("enter ur choice");
	     choice =s.nextInt();
	     switch(choice) {
	     case 1:// peek
	    	 if(q.isempty()) {
	    		 System.out.println("enter element u want=");
	    		 int data=s.nextInt();
	    		 q.push(data);
	    	 }
	    	 else
	    		 System.out.println("queue is full");
	    	 break;
	    	 
	     case 2://pop
	    	 if(q.isempty()) {
	    		 System.out.println("queue is already empty");
	    	 }
	    	 else
	    		 q.pop();
	       break;
	     case 3://peek
	    	 if(q.isempty()) {
	    		 System.out.println("queue is alreday empty");}
	    		 else
	    			 q.peek();
	    	 break;
	     
	     
	     
	     
	     
	     }
		  
		  
		  
		  
		  
		  
		  
	  }while(choice !=0);

	}

}
