/*8. Implement circular queue using counter method*/

package assignment2;

public class Circularqueue {
	private int arr[];
	private int front,rear;
	private final  int SIZE;
	private int counter;
	public Circularqueue(int size) {
	    arr =new int[size];
		this.front = -1;
		this.rear = -1;
		SIZE=size;
		counter=-1;
	}
	public void push(int data) {
		rear=(rear +1)% SIZE;
		arr[rear]=data;
		counter ++;
	}
	public void pop() {
		front=(front +1)% SIZE;
		if(front == rear) {
			 front = rear=-1;
			 counter --;
		}
		
	}
	public int peek() {
		
		return arr[front +1]%SIZE;
	}
	public boolean isFUll() {
		
		return (counter == SIZE-1);
	}
	public boolean isempty() {
		return (counter<SIZE-1 || counter ==-1 );
		
	}
	
	

}
