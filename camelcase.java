import java.util.*;
class camelcase
{
	char[] ch;
	public static void main(String args[])
	{
		camelcase obj = new camelcase();		
		String str;
		Scanner sc = new Scanner(System.in);
		int ctr = 0,i;
		str = sc.nextLine();
		int str_size = str.length();
		obj.ch = new char[str_size];
		obj.ch = str.toCharArray();
		//System.out.println("String size is "+str_size);
		for(i=0;i<str_size;i++)
		{
			if(obj.ch[i]>=65 && obj.ch[i]<=90)
				ctr = ctr+1;
		}
		System.out.println(ctr+1);

	}
}
