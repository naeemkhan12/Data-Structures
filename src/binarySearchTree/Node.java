package binarySearchTree;

public class Node {
	private Node left;
	private Node right;
	public Node(){
		
	}
	public Node(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	

}
