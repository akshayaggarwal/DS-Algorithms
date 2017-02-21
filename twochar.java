import java.util.*;

public class twochar
{
	int pangram(String str)
	{
		int flag,i;
		char ch;
		int[] count = new int[26];	
		for(i=0;i<26;i++)
			count[i]=0;	
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='a' && ch<='z')
				count[ch-97]++;
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
		}
		flag = 0;
		for(i=0;i<26;i++)
			{			
						
				//System.out.println(count[i]);		
				if(count[i]==0)
					{
					flag = 1;
					break;
					}
			}
		return flag;
	}

	public static void main(String[] args)
	{
		twochar obj = new twochar();		
		String str;//=new String("null");
		char ch;
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		//System.out.println(" String is " + str);
		int j = obj.pangram(str);
		if(j==0)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
