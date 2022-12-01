package SuperPrograms;

public class SuperVarChild extends SuperVarParent
{
	int a=45;
	public void disp()
	{
		int parentvar=super.a;
		int sum=a+parentvar;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		SuperVarChild obj=new SuperVarChild();
		obj.disp();

	}

}
