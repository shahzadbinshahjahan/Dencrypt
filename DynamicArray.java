class DynamicArray
{
	static int[] add(int b[], int ele)
	{
		int i;
		int temp[]=new int[b.length+1];
		for(i=0;i<b.length;i++)
			temp[i]=b[i];
		temp[i]=ele;
		return temp;
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6};
		a=add(a,9);
		a=add(a,10);
		a=add(a,12);
		for(int ele:a)
			System.out.println(ele);
	
	}
}
