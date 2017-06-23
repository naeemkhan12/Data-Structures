package doublyLinkedList;

import linkedList.LinkedList;

public class DoublyLinkedList extends LinkedList{

	
	Node footer = null;
	Node header = null;
	@Override
	public void addAtStart(Node t){
		if(header!=null)
			header.setNext(t);
		t.setNext(null);
		t.setPervious(header);
		header=t;
		if(footer==null)
			footer= t;
	}
	@Override
	public void removeAtStart(){
		header=header.getPervious();
		header.setNext(null);
		if(footer==header)
			footer=null;
	}
	@Override
	public void addAtEnd(Node t){
		t.setNext(footer);
		t.setPervious(null);
		if(footer!=null)
		footer.setPervious(t);
		footer=t;
		if(header==null)
			header=t;
		//System.out.println(header.data+" " +footer.data);
	}
	@Override
	public void removeAtEnd(){
		footer=footer.getNext();
		footer.setPervious(null);
		if(header==footer){
			header=null;
		}
		
	}
	public void addAtIth(Node t ,int i){
		if(i==0)
			addAtStart(t);
		else{
			int counter = 0;
			Node iterator = header;
			while(iterator!=null){
				if(counter==(i-1)){
					t.setNext(header);
					t.setPervious(iterator.getPervious());
					iterator.setPervious(t);
					iterator=t.getPervious();
					iterator.setNext(t);
					break;
				}
				iterator=iterator.getNext();
			}
		}
	}
	@Override
	public void removeAtIth( int i){
		if(i==0)
			removeAtStart();
		else{
			int counter = 0;
			Node iterator = header,next,pervious;
			while(iterator!=null){
				if(counter==(i-1)){
					 next = iterator.getNext();
					 pervious= iterator.getPervious();
					 pervious.setNext(next);
					 next.setPervious(pervious);
					break;
				}
				iterator=iterator.getNext();
				
			}
		}
	}
	@Override
	public void display(){
		Node start = header, end=footer;
		while (start!=end){
			System.out.println(start.getData());
			System.out.println(end.getData());
			start=start.getPervious();
			if(start==end)
				break;
			end = end.getNext();
		}
	}
	public void merge(DoublyLinkedList list){
		this.addAtEnd(list.header);	
	}

	public static void main(String[] args) {
	
	}



}
