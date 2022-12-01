package HirarchicalPrograms;

public class ChildCal extends ParentCal
{
	float ans;
	public void mod()
	{
		ans=a%b;
		System.out.println("Modulus= " +ans);
	}
	public static void main(String[] args)
	{
		ChildCal obj=new ChildCal();
		obj.mod();
		
	}
}
