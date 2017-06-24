package binarySearchTree;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree(Node root){
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void addNode(Node pointer,int t){
		if(pointer==null){
			root = new Node(t);
			return;
			}
		 if( pointer.getData()>t){
			if(pointer.getLeft()==null){
				pointer.setLeft(new Node(t));
				return;
			}
			else{
				addNode(pointer.getLeft(),t);
				}
		}else{
			if(pointer.getRight()==null){
				pointer.setRight(new Node(t));
				return;
			}
			else{
			addNode(pointer.getRight(),t);
			}
			
			
		}
		
	}
	public Node search(Node pointer , int t){
		
		if(pointer.getData()==t || pointer==null){
			return pointer;
			}
		 if( pointer.getData()>t){
			return search(pointer.getLeft(), t);
		}else{
			return  search(pointer.getRight(), t);
			
		}
		
	}
	
	public void inOrder(Node root){
		if(root == null){
			return;
		}
		inOrder(root.getLeft());
		System.out.println(root);
		inOrder(root.getRight());
	}
	public void preOrder(Node root){
		if(root == null){
			return;
		}
		System.out.println(root);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	public void postOrder(Node root){
		if(root == null){
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root);
	}

	

public Node delete(Node pointer){
	Node left = pointer.getLeft();
	Node right= pointer.getRight();
	if(pointer.getLeft()==null && pointer.getRight()==null){
		return null;
	}
	else if(pointer.getRight()==null){
		return pointer.getLeft();
	}else if(pointer.getLeft()==null){
		return pointer.getRight();
	}else{
		pointer = pointer.getRight();
		Node pervious = null;
		if(pointer.getLeft()==null){ 
			pointer.setLeft(left);
			return pointer;
		}
		while(pointer.getLeft()!=null){ 
			pervious=pointer;
			pointer= pointer.getLeft();
		}
		pervious.setLeft(pointer.getRight());
		pointer.setLeft(left); 
		pointer.setRight(right); 
		return pointer; 
		
	}
	
}
public void heightOfTree(Node tree,int sum){
}

public Node deleteNode(Node root , int t){
	if(root==null){
		System.out.println("Not Found ..");
		return null;
	}
	if(root.getData() == t){
		return delete(root);
	}else if(root.getData()>t){
		root.setLeft( deleteNode(root.getLeft(),t));
		return root;
		
	}else{
		root.setRight(deleteNode(root.getRight(),t));
		return root;
	}
	
}
public static void main (String[] args){
	BinarySearchTree tree = new BinarySearchTree(new Node(5));
	tree.addNode(tree.getRoot(), 4);
	tree.addNode(tree.getRoot(), 3);
	tree.addNode(tree.getRoot(), 2);
	tree.addNode(tree.getRoot(), 1);
	tree.heightOfTree(tree.getRoot(),0);
}

}
