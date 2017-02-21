// most important is to enjoy programming
// if you can enjoy th ejourney nothing else matters
import java.util.*;
class string2
{
	char[] arr;
	char[] temp;

	public static void main(String args[])
	{
		int i,j,k,b,ctr;
		
		string2 obj = new string2();
		obj.arr = new char[100];
		obj.temp = new char[100];
		Scanner sc = new Scanner(System.in);
		String str;
		j = 0;		
		str = sc.nextLine();
		obj.arr = str.toCharArray();
		int m = 0;	
		b = obj.arr.length;
		while(m==0)		
		{
		ctr = 1;		
		j = 0;

		//System.out.println("reached0");
		obj.temp[0] = obj.arr[0];
		//System.out.println("reached1");
		//System.out.println("value of b is " + b);
			for(i=1;i<b;i++)
			{
			ctr = 1;
			//System.out.println("reached2");
			if(obj.arr[i] == obj.temp[j])
			{			
						
				for(k=i;k<b;)
				{
					System.out.println("reached here");
					if(obj.arr[k]==obj.temp[j])
						{k = k + 1; ctr++;}
					else
						break;
				}
			
			i = k;
			if(ctr%2 == 0)			
				j = j - 1;;
			}
			
			//System.out.println("value of i is " + i);
			//System.out.println("value of j is " + j);

			if(i<b)	
			{j = j + 1;
			obj.temp[j] = obj.arr[i];}
						 
			}
			//System.out.println("reached3");
			
			//for(k=0;k<=j;k++)
			//	System.out.print(obj.temp[k]);
			//System.out.println();
		
			//if(j == b)
			//{
				
			//}


				
		boolean blnresult = Arrays.equals(obj.temp,obj.arr);
		
		
		if(blnresult == true)
			{m = 1;b=j+1;}
		obj.arr = obj.temp; 		
		}// end of while
		//System.out.println("value of j is "+j);
			for(k=0;k<=j;k++)
				System.out.print(obj.temp[k]);
			System.out.println();		
			if(j<=0)
			System.out.println("Empty String");

	}

}
