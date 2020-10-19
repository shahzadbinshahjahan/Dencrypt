//package vyshnav;

import java.util.Scanner;

class Encrypt
{
	public static StringBuilder toCode(String sent, String encrypt_sent)
	{
		int length=sent.length();
		int encrypt_len=encrypt_sent.length();
		int code[]=new int[encrypt_len+1];
		//System.out.println(length);
		int i,k=0;
		char c1,c2;
		for(i=0;i<length;i++)
		{
				c1=Character.toLowerCase(sent.charAt(i));
				c2=Character.toLowerCase(encrypt_sent.charAt(k));
				//System.out.println(c1);
				//System.out.println(c2);
				if(c1==c2)
				{
					code[k]=i;
					k++;
				}
				
				if(k==encrypt_len)
					break;
		}
		int count=0;
		for(int ele:code)
		{
			if((ele/10)==0)
				count++;
			//System.out.println(ele);
		}
		//System.out.println("count : "+count);
		count--;	//the last interger is being counted which is there to save number of single digit, so minus 1
		code[code.length-1]=count;
		
		//for(int ele:code)
		//	System.out.println(ele);

		StringBuilder key=new StringBuilder();
		for(int ele:code)
			key.append(ele);
		//int key1=Integer.parseInt(string_key.toString());

		return key;
	}

	public static void main(String args[])
	{
		String sentence;
		String encrypt_sentence;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Sentence which contains your required letters of your sentence: ");
		sentence=sc.nextLine();
		System.out.println("Enter Sentence which you want to encrypt: ");
		encrypt_sentence=sc.nextLine();
		
		//System.out.println(sentence+"\n"+encrypt_sentence);
		
		StringBuilder key=new StringBuilder(toCode(sentence, encrypt_sentence));
		System.out.println("Key : "+key);

	}
}


