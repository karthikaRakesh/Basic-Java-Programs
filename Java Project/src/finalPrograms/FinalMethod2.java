package finalPrograms;

public class FinalMethod2 extends FinalMethod
{
	/*public void add(int a,int b)
	{
		sum=a+b;
		System.out.println("Sum = " +sum);
	}*/  // final method can't override 
	public static void main(String[] args) 
	{
		FinalMethod2 obj=new FinalMethod2();
		obj.add(2, 3);

	}

}
