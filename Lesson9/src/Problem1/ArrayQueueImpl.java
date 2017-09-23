package Problem1;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() {
		if (isEmpty()){
			return -1;}
		return arr[front];
	}
	
	public void enqueue(int obj){
		if(front == -1)
			front ++;
		if(isFull())
			resize();
		arr[rear++] = obj;
	}
	private void resize() {
		int[] temp = new int[arr.length *2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	private boolean isFull() {
		return rear == arr.length;
	}

	public int dequeue(){
		if (isEmpty()){
			return -1;
		}
			
		int first = arr[front];
		front++;
		return first;
	}
	
	public boolean isEmpty(){	
		return (front == -1 || front >= rear);
	}
	
	public int size(){	
		if (isEmpty())
			return 0;
		return rear - front;
	}
	public static void main(String[] args){
		ArrayQueueImpl q = new ArrayQueueImpl();
//		q.peek();
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
	}
}
