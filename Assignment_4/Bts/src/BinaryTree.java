

public class BinaryTree {
	public class Node{
		private int data;
		private Node right;
		private Node left;
		public Node(int value) {
		     this.data = value;
			this.right =null;
			this.left = null;
		}
	}
	private Node root;
	public BinaryTree() {
		this.root =null;
	}
	public boolean isEmpty() {
		return root==null;
	}
	public void addNode(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			root=newnode;
		}
		else {
			Node trav=root;
			while(trav != null) {
				if(value < trav.data) {
					if(trav.left==null) {
						trav.left=newnode;
						break;
					}
					else
						trav=trav.left;
				}		
					
					else
					{ if(trav.right == null) {
						trav.right=newnode;
						
						
					}
					else
						trav=trav.right;
					}
		}
			
}
		}
}



