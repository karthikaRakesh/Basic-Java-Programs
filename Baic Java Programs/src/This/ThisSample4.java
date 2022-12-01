package This;

public class ThisSample4
{
	int a=15,b=4,sum,diff;
	public void add(int a,int b)//with parameter ()-without para
	{
		sum=a+b;
		System.out.println("Sum= " +sum);
	}
	public void sub()
	{
		diff=a-b;
		System.out.println("Difference= " +diff);
	}
	public ThisSample4(String name)
	{
		this.add(3,4);//with para ()-without para
		System.out.println(name);
	}	
	public static void main(String arg[])
	{
		ThisSample4 obj1=new ThisSample4("Karthika");
		obj1.sub();
	}
}