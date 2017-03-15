import java.util.*;
import java.math.*;

class fibonacci_modified
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		String str;
		String parts[];
		double n1,n2,n,j;
		double c = 0;		

		str = sc.nextLine();
		parts = str.split(" ");
		n1=((double)Integer.parseInt(parts[0]));
		n2=((double)Integer.parseInt(parts[1]));
		n = (double)Integer.parseInt(parts[2]);
	        BigDecimal BigDec1 = new BigDecimal(n1);
	        BigDecimal BigDec2 = new BigDecimal(n2);		
	        BigDecimal BigDec3 = new BigDecimal("0");

		if(n==1)
			System.out.println(n1);
		else if(n==2)
			System.out.println(n2);
		else
			{
				for(j=1;j<=n-2;j++)
				{
					BigDec3 = BigDec1.add(BigDec2.multiply(BigDec2));
					BigDec1 = BigDec2;
					BigDec2 = BigDec3;
					str=String.format("%.0f",BigDec3);
	//				BigDec1.add(str);
				}
			//str=String.format("%.0f",c);
			System.out.println(str);

			}
	}
}
