package Problem1;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		System.out.println("Before we add element to the queue, peek element: " + q.peek());
		for (int i = 0; i < 15; i++){
			q.enqueue(i);}
		System.out.println("Queue elements after we enqueue: " + q);
		
		for (int i = 0; i < 14; i++){
			q.dequeue();}
		System.out.println("After we dequeue element from the queue, peek element: " + q.peek());
		
		System.out.println("Size: " + q.size());

	}

}
/*Output
Before we add element to the queue, peek element: -1
Queue elements after we enqueue: ArrayQueueImpl [arr=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0, 0, 0, 0, 0], front=0, rear=15]
After we dequeue element from the queue, peek element: 14
Size: 1*/