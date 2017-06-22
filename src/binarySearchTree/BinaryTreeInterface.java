package binarySearchTree;

public interface BinaryTreeInterface {
	public void setRoot(Node tree);
	public Node search(Node node,int key);
	public void insert(Node tree,Node node);
	public void delete(Node tree,Node node);
	public void findMin(Node tree);
	public void findMax(Node tree);
	public Node successor(Node tree);
	public Node predecessor(Node tree);
	public void inOrder(Node tree);
	public void preOrder(Node tree);
	public void postOrder(Node tree);
	public int size(Node tree);
	

}
