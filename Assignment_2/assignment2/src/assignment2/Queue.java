package assignment2;

public class Queue {
	private int arr[];
	private int rear, front;
	private final int size;

	public Queue(int size) {

		arr = new int[size];
		this.rear = 0;
		this.front = 0;
		this.size = size;
	}

	public void push(int data) {
		arr[rear] = data;
		rear++;

	}

	public void pop() {
		front++;
	}

	public int peek() {
		return arr[front];

	}  

	public boolean isfull() {
		return rear == size;

	}

	public boolean isEmpty() {
		return rear == front;
	}

}
