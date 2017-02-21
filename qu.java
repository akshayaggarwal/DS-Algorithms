import java.util.LinkedList;
import java.util.Queue;

public class qu
{
	public static void main(String args[])
	{
	Queue<Integer> que = new LinkedList<Integer>();
	que.offer(5);
	que.offer(6);
	que.offer(7);
	System.out.println("Queue print : " + que);
	
	int head = que.element();
	System.out.println("Head element: " + head);
	
	int element1 = que.poll();
	System.out.println("Removed Element : " + element1);

	System.out.println("Queue print after poll : " + que);
	int element2 = que.remove();
	System.out.println("remove element " + element2);
	
	System.out.println("Queue Print after remove : " + que); 

	}
}
