class WhyNotZero
{
	public static void main(String args[])
	{
		int array[]=new int[10];
		String a="1234467890";
		//int b=Integer.parseInt(a);
		//System.out.println(a);
		//System.out.println(b);
		//char c=a.charAt(0);
		//int ch=Integer.parseInt(String.valueOf(c));
		//System.out.println(ch);
		for(int i=0;i<10;i++)
		{
			char c=a.charAt(i);
			int ch=Integer.parseInt(String.valueOf(c));
			array[i]=ch;
		}
		for(int ele:array)
			System.out.println(ele);


		
	}
}
