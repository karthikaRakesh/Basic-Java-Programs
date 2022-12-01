package abstractPrograms;

public class Sample1Child extends Sample1
{
	int sum;
	public void add(int a, int b) 
	{
		System.out.println("Abstract method extends here");
		System.out.println("***********************************");
		sum=a+b;
		System.out.println(sum);	
	}
	public static void main(String[] args) 
	{
		Sample1Child obj=new Sample1Child();
		obj.add(2, 4);
		obj.disp();

	}



}
