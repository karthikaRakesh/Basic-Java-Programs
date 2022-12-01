package HirarchicalPrograms;

public class ChildCal2 extends ParentCal
{
	float ans;
	public void div()
	{
		ans=a/b;
		System.out.println("Division= "  +ans);
	}
	
	public static void main(String[] args)
	{
		ChildCal2 obj=new ChildCal2();
		obj.div();		
	}

}
