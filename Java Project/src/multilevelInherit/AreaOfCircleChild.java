package multilevelInherit;

public class AreaOfCircleChild extends AreaTriangleParent
{
	float area,pi=3.14f;
	public void area2(int r)
	{
		area=pi*(r*r);
		System.out.println("Area of circle= "+area);
	}
}
