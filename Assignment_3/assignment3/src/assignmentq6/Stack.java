package assignmentq6;

public class Stack1 {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack1(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	
	public void push(int data)
	{
	  top++;
	  arr[top]=data;
	}
	
	public int pop()
	{
		int data=arr[top];
		top--;
		return data;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
	     return top==SIZE-1;
	}

}
private int arr[];
private int top;
private final int SIZE;

public Stack(int size)
{
	SIZE=size;
	arr=new int[SIZE];
	top=-1;
}

public void push(int data)
{
  top++;
  arr[top]=data;
}

public int pop()
{
	int data=arr[top];
	top--;
	return data;
}

public int peek()
{
	return arr[top];
}

public boolean isEmpty1()
{
	return top==-1;
}

public boolean isFull1()
{
     return top==SIZE-1;
}

}



