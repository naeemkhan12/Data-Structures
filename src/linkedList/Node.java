package linkedList;

public class Node {
	int data;
	private Node next;
	private Node()
	{
		data=0;
		next = null;
	}
	public Node(int i)
	{
		data=i;
		next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void display() {
		System.out.println("Data: "+data);
	}

}
