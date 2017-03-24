// Code is derived from Geeksforgeeks.org

import java.util.*;

public class stairs
{
	static int fib(int n)
	{
		if(n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}

	// Returns number of ways to reach s'th stair
	static int countWays(int s)
	{
		return fib(s + 1);
	}

	public static void main(String args[])
	{
		int s;

		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();

		System.out.println("Numbe of ways = "+ countWays(s));
	}
}
