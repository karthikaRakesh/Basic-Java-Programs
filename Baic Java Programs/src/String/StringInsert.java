package String;

public class StringInsert 
{

	public static void main(String[] args) 
	{
		StringBuffer obj=new StringBuffer("Karthika");
		System.out.println(obj);
		
		obj.append(" S");
		System.out.println(obj);
		
		obj.insert(2, 10);
		System.out.println(obj);
		
		obj.replace(0, 2, "Name");
		System.out.println(obj);
	}

}
