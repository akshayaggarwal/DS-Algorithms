import java.util.*;
class string1
{
	String str;
	StringBuilder ch_new = new StringBuilder();
	StringBuilder text = new StringBuilder();
	
	// initialise variables here so that no worry for default vals

	public static void main(String args[])
	{
		
			int i;
			int j;
			int k;
		
		string1 obj = new string1();
		
		obj.ch_new.ensureCapacity(100);		
		
		Scanner sc = new Scanner(System.in);
		
		obj.str = sc.nextLine();

		obj.text.append(obj.str);
		System.out.println(obj.text);
		for(i=0;i<obj.text.length();i++)		
			obj.ch_new.append(obj.text.charAt(i));

		for(i=0;i<obj.ch_new.length();i++)		
			System.out.println(obj.ch_new.charAt(i));

		System.out.println("hi1");				
		j = 1;
		System.out.println("hi");
		for(i=0;i<obj.text.length();i++)
			{		
				obj.ch_new.append(obj.text.charAt(i));
				for(j=i+1;obj.text.charAt(j) == obj.text.charAt(i);j++);
				i = j-1;
/*				
				System.out.println(text.charAt(i));
				if(temp == text.charAt(i))
				{
				for(i=i+1;(i<text.length())||(temp == text.charAt(i));i++);
				if(i<text.length() && temp!=text.charAt(i))	
					{ch_new.append(text.charAt(i));
					//j++;
					temp = text.charAt(i);}	

				}
				else
				{
					//System.out.println("sk reached");
				 	ch_new.append(text.charAt(i));
					//j++;
					temp = text.charAt(i);
				}	
*/
			}
		System.out.println("The reduced String is");

		for(k=0;k<obj.ch_new.length();k++)
			System.out.println(obj.ch_new.charAt(k));

		System.out.println("The size of the string is");
		System.out.println(obj.text.length());
	}

}
