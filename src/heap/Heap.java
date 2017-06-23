package heap;

public class Heap {

	private Node heap[] = new Node[15];
	
	
	
	
	// swap two Node
	public void swap(int n, int m){
		Node temp;
		temp=heap[n];
		heap[n]=heap[m];
		heap[m]=temp;
	}
	// to maintain the heap balance
	/*check whether the parent of the element has lower priority , swap if 
	 * yes and then continue to check the parent of the parent up to root element 
	 * */
	public void balance(int pos , Node n){
		int nPos = pos;
		if(pos<=0){
			return;
			
		}else{
			pos/=2;	
			if(n.getPriority()>heap[pos].getPriority()){
				swap(nPos,pos);
				balance(pos,n);
			}else{
				
				return;
			}
		}
		
		
	}
	// to add element into heap
	public void addElement(int pos, Node n){
		
		//base case for adding element 
		if(pos==heap.length){
			System.out.println("Heap is Full ......");
			return;
		}
		// if given position is null then enter it here
		if(heap[pos]==null){
			heap[pos]=n;
			balance(pos,n);
			return;
		}else{ //move to the next element of array.
			pos++;
			addElement(pos, n);
		}
		
	}
	
	// Generic addition of element just to avoid the junk
	public void add(Node n){
		addElement(0, n);
	}
	
	// show heap element and their ordering
	
	public void show(){
		for(int i =0 ; i< heap.length;i++){
			if(heap[i]!=null)
			System.out.println(heap[i].toString()+"     "+i);
		}
		
	}
	// to search the particular Element
	public int search(Node n){
		for(int i=0 ; i<heap.length;i++){
			if(heap[i]==n){
				return i;
			}else if (heap[i]==null){
				break;
				
			}
		}
		return -1;
	}
	// to change the priority of any existing element
	/*First search the element index if it exist change the priority and then balance the
	 * heap 
	 * */
	
	public void changePrior(Node n , int prior){
		int pos = search(n);
		if(pos!=-1){
		
			n.setPriority(prior);
			balance(pos,n);

		}
			}
	// to get highest priority element
	public Node top(){
		if(heap[0]!=null)
		return heap[0];
		return null;
	}
	
	public static void main(String[] args){
	}
	


}
