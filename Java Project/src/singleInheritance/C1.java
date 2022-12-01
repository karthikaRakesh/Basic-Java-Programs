package singleInheritance;

public class C1 extends P1
{
	float ans;
	public void add()
	{
		ans=a+b;
		System.out.println(ans);
	}
	
	public static void main(String[] args)
	{
		C1 obj=new C1();
		obj.add();
		

	}

}
