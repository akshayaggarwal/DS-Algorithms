//implement a queue using two stacks
import java.util.*;
import java.io.*;
public class qu3
{
	Stack s1 = new Stack();
	
	void push(int n)
	{

        Stack temp = new Stack();

	int si = s1.size();
        int j = 0;
        int element;
 
        s1.push(n);
        while(j<n)
        {
                element = s1.peek();
                s1.pop();
                temp.push(s1.peek());
                j++; 
       }
        j = 0;
        
        si = temp;

	}

	void pop()
	{
	
	}

	void top()
	{	

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
                qu3 obj = new qu3();		
                int i,j,a1,a2;
                i = sc.nextInt();
		for(j=0;j<i;j++)
                {
                  a1 = sc.nextInt();
                  switch(a1)
                        {
                                case 1:{
                                        a2 = sc.nextInt();
                                        obj.push(a2);
                                        break;
                                        }
                                case 2:{
                                        obj.pop();
                                        break;
                                       }
                                case 3:{
                                        obj.top();
                                        break;
                                       }
                                default:{
                                        break;
                                        }
                        }
                }		

	}
}
