package String;

import java.util.Scanner;

public class StringRevese 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		
		String str1=str;
		String rev="";
		int leng=str.length();
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str1.equals(rev))
		{
			System.out.println("The given string is paliandrome");
		}
		else
		{
			System.out.println("The string is not paliandrome");
		}
		
		
	}

}
