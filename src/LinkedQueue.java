// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	void removeMiddle() 
	{
		LinkedNode previous = front;
		int num = 0; 
		int middle = count/2;
		while(num < middle -1)
		{
			previous = previous.next;
			num++;
		}
		LinkedNode current = previous.next;
		previous.next = current.next;
		current.next = null;
	}
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
	
	public String toString()
	{
		String result ="";
		LinkedNode current = front;
		while(current.next !=null)
		{
			current = current.next;
			result = result+ "\n"+ current.x;
		}; 
		return front.x + result;
	}
}
