package CommandLine;

public class AreaOfFigs 
{
	int area;
	public void areac(float r)
	{
		float pi=3.14f;
		float area=pi*r*r;
		System.out.println(area);
		
	}
	public void areasq(int a)
	{
		area=a*a;
		System.out.println(area);
	}
	public void arearect(int c, int b)
	{
		area=c*b;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		float r=Float.parseFloat(args[0]);
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		int c=Integer.parseInt(args[3]);
		
		AreaOfFigs obj=new AreaOfFigs();
		obj.areac(r);
		obj.areasq(a);
		obj.arearect(b, c);

	}

}
