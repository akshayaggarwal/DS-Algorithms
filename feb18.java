import java.util.*;
class feb18
{

	int arr1[],arr2[];

	public static void main(String args[])
	{
		feb18 obj = new feb18();
		Scanner sc = new Scanner(System.in);
		int i,j,num,n,p,a,b,counter;	
		double mul,spec_counter;	
		long lol;	
		String temp;
		String parts[],parts2[];
		//char str[];
		StringBuilder str = new StringBuilder();

		spec_counter = 0;
		mul = 0;
		counter = 1;

		temp = sc.nextLine();

		parts = temp.split(" ");
		
		n = Integer.parseInt(parts[0]);
		p = Integer.parseInt(parts[1]);

		obj.arr1 = new int[n];
		
	//	for(i=0;i<n;i++)
	//	{
			
	//	}

		for(i=0;i<p;i++)	
		{
			temp = sc.nextLine();

			parts = temp.split(" ");
		
			a = Integer.parseInt(parts[0]);
			b = Integer.parseInt(parts[1]);

			if(obj.arr1[a] == 0 && obj.arr1[b] == 0)
			{
				obj.arr1[a]=counter;
				obj.arr1[b]=counter;
				counter++;
			}

			else if(obj.arr1[a]!=0 && obj.arr1[b]==0)
			{
				num = obj.arr1[a];
				obj.arr1[b] = num;
			}

			else if(obj.arr1[b]!=0 && obj.arr1[a]==0)
			{
				num = obj.arr1[b];
				obj.arr1[a] = num;
			}
			else
			{
				num = obj.arr1[b];
				for(j=0;j<n;j++)
				{
					if(obj.arr1[j]==num)
					{
						obj.arr1[j]=obj.arr1[a];
					}					
				}
			}

		}

		obj.arr2 = new int[counter];
	
		for(i=0;i<n;i++)
		{
			if(obj.arr1[i]==0)
			{
				spec_counter++;
			}
			else
				obj.arr2[obj.arr1[i]]++;
			//System.out.println(obj.arr2[obj.arr1[i]]);
		}
		
		for(i=0;i<counter;i++)
		{
			for(j=i+1;j<counter;j++)
			{
				mul+=(obj.arr2[i]*obj.arr2[j]);
			}

			mul+=obj.arr2[i]*spec_counter;
		}

		mul= mul + (spec_counter*(spec_counter-1))/2;
		lol = (long)mul;
		str.append(mul);
		i=str.indexOf(".");
		//for(j=0;j<i;j++)
		String str2=String.format("%.0f",mul);
		System.out.print(str2);		
		//for(i=0;str[i]!='.';i++)
		
//		System.out.println(p);
		//BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        	//String[] temp = bfr.readLine().split(" ");
        	//int N = Integer.parseInt(temp[0]);
        	//int I = Integer.parseInt(temp[1]);		
		
	}

}

