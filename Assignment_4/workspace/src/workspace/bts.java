package workspace;

public class bts {
   
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
	public bts() {
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
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.println(" "+trav.data);
		preorder(trav.left);
		preorder(trav.right);
		}
	public void preorder() {
		System.out.print("");
		preorder(root);
		System.out.println();
		
	}
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.println(" "+trav.data);
		}
	public void inorder() {
		System.out.print("");
		preorder(root);
		System.out.println();
	}
	public void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.println(" "+trav.data);
		}
	public void postorder() {
		System.out.print("");
		preorder(root);
		System.out.println();
	}
	
	public Node binarysearch(int key) {
		Node trav=root;
		while(trav !=null) {
			if(key == trav.data)
				return trav;
			else if(key <trav.data) {
				trav=trav.left;
			}
			else
				trav=trav.right;
			}
		return null;
	}
	public Node binarysearchwithparent(int key) {
		Node trav=root;
		Node parent=null;
		while(trav !=null) {
			if(key == trav.data) {
			      break;
			    parent=trav;
			      
			}
			else if(key <trav.data) {
				trav=trav.left;
			}
			else {
			
				trav=trav.right;
			}
		if(trav == null) {
			parent = null;
			
		}
		return new Node[] {trav,parent};
		
	}
	public void deleteNode(int key) {
		Node arr[]=binarysearchwithparent(key);
		Node temp=arr[0],parent=arr[1];
		if(temp == null)
			return;
		if(temp.left !=null && temp.right != null) {
			Node trav=temp.left;
			parent=temp;
			while(trav.right != null) {
				parent=trav;
				trav=trav.right;
			
				temp.data=trav.data;
				temp=trav;
				
			}
		if(temp.left == null) {
			if(temp== root)
				root=temp.right;
			else if(temp == parent.left) {
				parent.left=temp.right;
			}
			else  {
				parent.right=temp.right;
			
		}}
			
			else {
				if(temp==root)
				root=temp.left;
				else if(temp==parent.left)
					parent.left=temp.right;
				else
					parent.right=temp.left;
				
			}
				
			}
				
		
			
}
		
		
		
		
		
		
	}
	public int height(Node trav) {
		if(trav == null)
			return 0;
		int hl=height(trav.left);
		int hr=height(trav.right);
		int max=Integer.max(hl, hr);
		return max +1;
		
	}
		public int height() {
			return height(root);
		}
		
		
		
	
	
}
