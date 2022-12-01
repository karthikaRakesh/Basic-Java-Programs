package singleInheritance;

public class AreaParent 
{
	float area,pi=3.14f; 
	public void triangle(int b,int h)
	{
		area=(b*h)/2;
		System.out.println("Area of triangle:" +area);
	}
	public void circle(float r)
	{
		area=(r*r)*pi;
		System.out.println("Area of circle: "+area);
	}
}
