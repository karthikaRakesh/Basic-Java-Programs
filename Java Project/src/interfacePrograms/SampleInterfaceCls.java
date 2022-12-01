package interfacePrograms;

public class SampleInterfaceCls implements Sample
{
	public void print()
	{
		System.out.println("Testig for the 1st interface");
	}
	public static void main(String[] args) 
	{
		SampleInterfaceCls obj=new SampleInterfaceCls();
		obj.print();
		
	}

}
