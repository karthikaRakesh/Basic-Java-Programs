package collections;

import java.util.Iterator;
import java.util.LinkedList;
public class Sample3 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>a1=new LinkedList<Integer>();
		a1.add(200);
		a1.add(300);
		a1.add(400);
		System.out.println("First Linked List");
		System.out.println(a1);
		
		LinkedList<Integer>a2=new LinkedList<Integer>();
		a2.add(30);
		a2.add(40);
		a2.add(50);
		System.out.println("Secound Linked List");
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println("Added both Linked Lists");
		System.out.println(a1);
		
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
