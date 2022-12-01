package multilevelInherit;

public class AreaOfSquareChild extends AreaOfCircleChild
{
	public void area3(int a)
	{
		area=a*a;
		System.out.println("Area of square= "+area);
	}
	public static void main(String[] args) 
	{
		AreaOfSquareChild obj=new AreaOfSquareChild();
		obj.area3(20);
		obj.area2(12);
		obj.area1(12,10);
		
	}

}
