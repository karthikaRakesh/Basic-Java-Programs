package SuperPrograms;

public class C1 extends P1
{
	int sum;
	public void add(int a,int b)
	{
		super.add(13,23);
		sum=a+b;
		System.out.println("Child sum=" +sum);
	}
	public static void main(String[] args) 
	{
		C1 obj=new C1();
		obj.add(20,30);

	}
}
