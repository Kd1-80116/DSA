package assignment5;

public class Queue {
	public class Queue 
	{
		List l2;
		
	Queue()
	{
		l2=new List();
	}

	public boolean isEmpty()
	{
		return l2.isEmpty();
	}

	public void push(int value)
	{
	  l2.addLast(value);	
	}
	public void pop()
	{
		l2.deleteFirst();
	}

	public int peek()
	{
		return l2.getData();
	}

	public void display()
	{
		l2.display();
	}

	}

}
