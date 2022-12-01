package This;

public class ThisVarSample1
{
	String name;
	public void print(String name1)
	{
		this.name=name1;
		System.out.println("My name is " +this.name);
	}
	public static void main(String arg[])
	{
		ThisVarSample1 obj=new ThisVarSample1();
		obj.print("Karthika");
	}

}
