import java.util.*;

public class substr
{
	String str;
	int a;

	public static void main(String args[])
	{

		String small,big,temp;
		substr obj = new substr();
		Scanner sc = new Scanner(System.in);
		obj.str = sc.nextLine();

		obj.a = sc.nextInt();


		small = obj.str.substring(0,obj.a);
		big = obj.str.substring(0,obj.a);
		

		//System.out.println(small);

		for(int i=obj.a;i<=obj.str.length();i++)
		{
			temp=obj.str.substring(i-obj.a,i);

			//System.out.println(temp);

			if(temp.compareTo(small)<0)
				small = temp;

			if(temp.compareTo(big)>0)
				big = temp;

		}

		System.out.println(small);
		System.out.println(big);

	}
}

