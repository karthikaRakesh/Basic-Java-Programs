package encapsulation;

public class Areatria1 
{
	private int b,h,area;
	public void setArea(int b,int h)
	{
		this.b=b;
		this.h=h;	
	}
	public int getArea()
	{
		area=(b*h)/2;
		return area;
		
		
	}

}
