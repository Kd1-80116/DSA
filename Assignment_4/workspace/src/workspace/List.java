package workspace;

public class List {
	
	public class Node{
	private int data;
	private Node next;
	private Node prev;
	public Node(int value) {
       this.data = value;
		this.next =null;
		this.prev=null;
	}
	
	}
	private Node head;
	private Node tail;
	public List() {
		
		this.head = null;
		this.tail=null;
	}
	public boolean isEmpty() {
		return head==null && tail==null;
		
	}
	public void addFirst(int value) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head = tail =nn;
			
		}
		else {
			nn.next=head.prev;
			head.prev=nn.next;
			head=nn;
			
			
			
		}
		
}
	public void addLast(int value) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head=tail= nn;
			
		}
		else {
			nn.prev=tail.next;
			tail.next=nn.prev;
			tail=nn;
		}
	}
	
public void addPos(int value,int pos) {
		Node nn=new Node(value);
		
		
		if(isEmpty()) {
			head=tail=nn;
		}

		else {
			Node trav=head;
			for(int i=0;i<pos-1;i++) {
				trav=trav.next;
				nn.next=trav.next;
				nn.prev=trav;
				trav.next=nn;
				nn.next.prev=nn;
				
	}
}

		}

	
	public void delFirst() {
		if(isEmpty()) {
			
			System.out.println("list is empty");
		}
		else if(head == head.next) {
			head =tail=null;
			}
		else {
	           head=head.next;
	           head.prev=null;
			}
	
	}
	public void dellast() {
		if(isEmpty()) {
			return;
		}
		else if(head.next !=null) {
			head=null;
		}
		else {
			tail=tail.prev;
			
		}
		
	}
	
	public void delpos(int pos) {
		if(isEmpty())
			return;
		if(pos<=1)
			 delFirst();
		else {
			Node trav=head;
			for(int i=1;i<pos;i++) {
				trav=trav.next;
				trav.prev.next=trav.next;
				trav.next.prev=trav.prev;
				
				
			}
			
			
			
			
			
		}
	}
	public void displaylist() {
		if(isEmpty()) 
			return;
			System.out.print("list");
			Node trav=head;
	 do {
				System.out.print(" "+trav.data);
		          trav=trav.next;
			}while(trav != head);
			System.out.println("");
	}
		
	public void delall() {
		head=null;
	}
}		
	


