package Overriding;

public class SampleChild extends Sample1
{
	int a=100,b=3,sum;
	public void add()
	{
		sum=a+b;
		System.out.println("Child method sum=" +sum);
	}
	public static void main(String[] args) 
	{
		SampleChild obj=new SampleChild();
		obj.add();
	}

}
