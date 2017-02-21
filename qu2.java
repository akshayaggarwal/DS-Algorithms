// implementing Queue using Stack
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class qu1
{

	Queue<Integer> que = new LinkedList<Integer>();
	
	public void push(int x)
	{
	que.offer(x);	
	}
	
	public void pop()
	{
	Queue<Integer> quetemp = new LinkedList<Integer>();
	int si = que.size();
	int element1;
	while(si>1)
	{
	element1 = que.poll();
	si = que.size();
	//System.out.println("Removed Element : " + element1);
	quetemp.offer(element1);	
	}
	element1 = que.poll();
	if(si == 1)
		System.out.println(element1);
	
	si = quetemp.size();
	while(si>0)
	{
	element1 = quetemp.poll();
	si = quetemp.size();
	//System.out.println("Removed Element : " + element1);
	que.offer(element1);	
	}

	}

	public int top()
	{

	Queue<Integer> quetemp = new LinkedList<Integer>();
	int si = que.size();
	int element1, head = -111111;
	while(si>1)
	{
	element1 = que.poll();
	si = que.size();
	quetemp.offer(element1);	
	}
	if (si == 1)
		{head = que.poll();
		quetemp.offer(head);}
	
	si = quetemp.size();
	while(si>0)
	{
	element1 = quetemp.poll();
	si = quetemp.size();
	//System.out.println("Removed Element : " + element1);
	que.offer(element1);	
	}

	return head;	
	}

	public boolean empty()
	{	
	int si = que.size();
	if(si>0)
		return false;
	else
		return true;
	}

	public static void main(String args[])
 	{	
	qu1 s1 = new qu1();
	s1.que.offer(5);
	s1.que.offer(6);
	s1.que.offer(7);
	//s1.pop();
	Scanner sc = new Scanner(System.in);
	boolean b1;
	int j = 1,a;	
	while(j == 1)
	{
	System.out.println("Enter the value of j 1 push 2 pop 3 top 4 isempty");	
	int i = sc.nextInt();	
	switch(i)
	{
		case 1:{
			System.out.println("Enter the number to be added");
			a = sc.nextInt();			
			s1.push(a);
			break;
			}
		case 2:{
			s1.pop();
			break;
			}
		case 3:{
			int s = s1.top();
			System.out.println("top element is "+s);
			break;
			}
		case 4:{
			b1 = s1.empty();
			System.out.println(b1);
			break;
			}
		default:{
			System.out.println("Please enter i between 1 and 4");
			break;
			}

	}	//	end of switch
	System.out.println("Queue Print after operation : " + s1.que); 
	}	//	end of while
 	}	//	end of main
}		//	end of class
