class test
{
	public static void main(String args[])
	{
		final int hrs = 20;
		//hrs = 30;
		System.out.println(hrs);
		int a = 1;
		float f = (float)1.3;		
		//char e = a;
		//e = hrs;
		String str1 = "Akshay";
		String str2 = new String("Akshay");
		String str3 = "Akshay";
		if (str1.equals(str2))
			System.out.println(true);
		else
			System.out.println(false);
		if (str1.equals(str3))
			System.out.println(true);
		else
			System.out.println(false);
		short sh = (short)f;
		System.out.println(f);
		System.out.println(sh);
		System.out.println(String.valueOf(1.45));
		char cc = (char)(2);
		System.out.println(cc);
	}
}
