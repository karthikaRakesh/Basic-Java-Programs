package collections;

import java.util.ArrayList;
import java.util.*;  
public class Sample4
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("ABC");
		list.add("CFD");  
		list.add("RTY");  
		list.add("YUI");  
		list.add("WWW");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("Size of 1st list: " +list.size());
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("karthika");
		list1.add("Riya");
		list1.add("Parvathy");
		list1.add("Reshma");
		System.out.println(list1);
		
		System.out.println("Size of 1st list: " +list1.size());
		
		list.addAll(list1);
		System.out.println("Added List : " +list);
		
		list.removeAll(list1);
		System.out.println("Removed :" +list);
		
		list.addAll(list1);
		System.out.println("Added List : " +list);
		
		list.remove("karthika");
		System.out.println("Added List : " +list);
		
		Iterator itr1=list1.iterator();  
		System.out.println("Integer Array List  Traversing");
		while(itr1.hasNext())
		{  
			System.out.println(itr1.next());  
		}  
		Iterator itr=list.iterator();  
		System.out.println("String Array List Traversing");
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}
