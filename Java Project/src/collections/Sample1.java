package collections;

import java.util.LinkedList;

public class Sample1 
{
	public static void main(String[] args)
	{
		LinkedList<String> a1=new LinkedList<String >();
		a1.add("Karthika");
		a1.add("Riya");
		a1.add("Parvathy");
		a1.add("Reshma");
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		a1.add("Gigin");
		System.out.println(a1);
		
		a1.remove("Gigin");
		System.out.println(a1);
		
		a1.removeAll(a1);
		System.out.println(a1);
	}

}
