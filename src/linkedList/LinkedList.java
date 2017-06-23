package linkedList;

public class LinkedList {

		Node head;
		
		public LinkedList(Node e){
			this.head=e;
			
		}
		public LinkedList(){
			head =null;
			
		}
		
		public void display(){
			Node temp = head;
			while(head!=null){
				head.display();
				head=head.getNext();
			}
			this.head=temp;
			
		}
		public void addAtEnd(Node t){
			Node temp=head;
			Node secondLast = null;
			
			while(head!=null){
				//this.head.display();
				secondLast=head;
				this.head=head.getNext();
				
			}
			
			secondLast.setNext(t);
		//	this.head.display();
			head=temp;
			
		//	this.head.display();
			
		}
		public void addAtStart(Node x){
			x.setNext(head);
			head=x;
			
		}
		public void deleteFromStrart(){
			head = head.getNext();
		}
		public void deleteFromEnd(){
			Node temp = head;
			Node secondLast = null;
			
			while(this.head!=null){
				secondLast=head;
				head=head.getNext();
			}
			secondLast=null;
			this.head=temp;
			
			
			
		}
		public Node Search(int data){
			Node temp=head;
			while(head!=null){
				if(head.getData()==data)
					return head;
				head=head.getNext();
				
			}
			head = temp;
			return null;
			
			
		}
		public void deleteAtI(int index){
			int counter = 0,end=size()-1;
			Node header = head;
			Node pervious = null;
			while (header!=null){
				if(index==0){
					this.head=header.getNext();
					head.display();
					break;
				}else if(index==counter){	
					if(index!=end){
					//	System.out.println(pervious.next.name);
						pervious.setNext(header.getNext());
						//System.out.println(pervious.next.name);
						break;
					}
					else {
						deleteFromEnd();
					break;
					}
				}
				pervious= header;
				header= header.getNext();
				counter++;
			}
			
		}
		public boolean isEmpty(){
			if(head==null){
				return true;
			}
			return false;
		}
		public int size(){
			int counter=1;
			Node header = head;
			while(header!=null){
				header=header.getNext();
				counter++;
			}
			
			return counter;
		}
		

		public void merge(LinkedList b){
		this.addAtEnd(b.head);	
		}
		
public static void main(String[] args){
	LinkedList list = new LinkedList(new Node(5));
	list.addAtEnd(new Node(3));
	list.addAtEnd(new Node(2));
	list.addAtEnd(new Node(1));
	list.addAtEnd(new Node(6));
	list.addAtEnd(new Node(7));
	list.addAtEnd(new Node(8));
	list.addAtEnd(new Node(9));
	list.display();
	list.deleteAtI(5);
	list.display();
	
}

}
