
public class Driver 
{

	public static void main(String[] args) 
	{
		ArrayQ arrayQ = new ArrayQ();
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);
				
		System.out.println("Number being removed from the ArrayQ");
		for(int i = 0; i < arrayQ.size(); i=i*2)
		{
			int arrayQNumber = arrayQ.dequeue();
			System.out.println(arrayQNumber);
		}
		
		LinkedQueue linkedQueue = new LinkedQueue();
		linkedQueue.enqueue(1);
		linkedQueue.enqueue(7);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(9);
		linkedQueue.enqueue(2);

		System.out.println("Number being removed from the linkedQueue");
		for(int i = 0; i < linkedQueue.size(); i=i*2)
		{
			int linkedQNumber = linkedQueue.dequeue();
			System.out.println(linkedQNumber);
		}
		/*
		 * Modify the LinkedQueue class to include a new method called removeMiddle, which
removes from the queue the value that is in the middle.
For example, if the queue contains 3, 7, 2, 4, 5, then 2 will be removed.
If the queue contains 2, 9, 1, 4 (even number of values), then remove 9 (round down).
Test the method using the Driver program.
		 */
		//Add value to the stack to test the exercise 2
		
		linkedQueue.enqueue(1);
		linkedQueue.enqueue(7);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(9);
		linkedQueue.enqueue(2);
		
		linkedQueue.removeMiddle();
		System.out.println("After removed the middle element, here is the current stack: ");
		System.out.println(linkedQueue);
		
	}
	
}
