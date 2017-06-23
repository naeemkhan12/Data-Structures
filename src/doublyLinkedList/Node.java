package doublyLinkedList;

public class Node extends linkedList.Node{
private Node next;
private Node pervious;
private int data;

public Node(Node next, Node pervious,int data) {
	super();
	this.next = next;
	this.pervious = pervious;
	this.data = data;
}
public Node(int data){
	this.data =data;
	this.next = null;
	this.pervious = null;
}
@Override
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
public Node getPervious() {
	return pervious;
}
public void setPervious(Node pervious) {
	this.pervious = pervious;
}
@Override
public int getData() {
	return data;
}
@Override
public void setData(int data) {
	this.data = data;
}


}
