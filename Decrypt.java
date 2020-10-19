import java.util.Scanner;
class Decrypt
{
	public static StringBuilder fromCode(String sent, String key1)
	{
		long count=Long.parseLong(key1)%10;
		//System.out.println(count);
		StringBuilder key_stringbuilder=new StringBuilder(key1);
		int a[]=new int[0];
		StringBuilder key=new StringBuilder(key_stringbuilder.deleteCharAt(key1.length()-1));
		//System.out.println(count);
		//System.out.println(key);
		for(int i=0;i<count;i++)
		{
			char c=key.charAt(i);
			//System.out.println(c);
			int ch=Integer.parseInt(String.valueOf(c));
			a=add(a,ch);
			//a=add(a,Integer.parseInt(String.valueOf(c)));
		}
		for(int i=(int)count;i<key.length();i+=2)
		{	
			//System.out.print(key.charAt(i));
			String ch=String.valueOf(key.charAt(i))+String.valueOf(key.charAt(i+1));
			//System.out.println(ch);
			int c=Integer.parseInt(ch);
			a=add(a,c);
		}
		
		//for(int ele:a)
		//	System.out.println(ele);
		
		StringBuilder encrypted_sentence=new StringBuilder();
		for(int i=0;i<a.length;i++)
			encrypted_sentence.append(sent.charAt(a[i]));
		
		return encrypted_sentence;
	}

	public static int[] add(int b[], int ele)
	{
		int temp[]=new int[b.length+1];
		int i;
		for(i=0;i<b.length;i++)
			temp[i]=b[i];
		temp[i]=ele;
		return temp;
	}

	public static void main(String args[])
	{
		String sentence;
		String key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		sentence=sc.nextLine();
		System.out.print("Enter Key : ");
		key=sc.next();
		//System.out.println(sentence);
		//System.out.println(key);
		StringBuilder encrypt_sentence=new StringBuilder(fromCode(sentence,key));
		System.out.println("Encrypted sentence is : ");
		System.out.println(encrypt_sentence);

		//for(int ele: encrypt_sentence)
		//	System.out.println(ele);
	}
}

