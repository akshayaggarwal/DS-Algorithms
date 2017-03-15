import java.util.*;

public class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[6][6];
		int i,j,sum,max;
		max = 9*7;
		max*=-1;		

		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				arr[i][j] = sc.nextInt();
			}

			sc.nextLine();
		}
		
		for(i=0;i<4;i+=3)
		{
			for(j=0;j<4;j++)
			{
				sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(sum>max)
					max=sum;
			}
		}
		
		System.out.println(max);
	}
}
