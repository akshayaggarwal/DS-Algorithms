import java.util.*;
class basic
{
	char[] arr;
	char[] temp;
	public static void main(String args[])
	{
		basic obj = new basic();
		obj.arr = new char[100];
		obj.temp = new char[100];
		String str;
		int main_size,flag,j,i,k,ctr;
		j = 0;		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		obj.arr = str.toCharArray();
		main_size = str.length();
		//System.out.println("Size is " + main_size);
		
		flag = 1;

		while(flag==1)
		{		
		j = 0;
		for(i=0;i<main_size;i++)
		{
			obj.temp[j] = obj.arr[i];
			ctr = 1;
			for(k=i+1;k<main_size;k++)
			{
				if(obj.arr[k]!=obj.temp[j])
					break;
				else
					ctr++;
			}
			i = k-1;
			if(ctr%2 != 0)	
				j = j+1;
		}
		
		//System.out.println("value of j is "+j);
		
		
		//flag = 0;
		if(j==main_size)
		{
			flag = 0;
			for(k=0;k<j;k++)
			{
				if(obj.arr[k]!=obj.temp[k])
				{
					flag = 1;
					break;
				}
			}
		}		


		if(flag == 0)
			break;
		else
			{
				for(k=0;k<j;k++)
				{
					obj.arr[k] = obj.temp[k];
				}	
				main_size = j;
			}
	
		}	
		
		if(j==0)
			System.out.println("Empty String");		

		for(k=0;k<j;k++)
		{
			System.out.print(obj.temp[k]);
		}
	}
}
