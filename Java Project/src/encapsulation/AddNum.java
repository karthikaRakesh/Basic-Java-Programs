package encapsulation;

public class AddNum 
{
	private int a,b;
	private float x,y,sum;
	public void setAdd(int a,int b,float x,float y)
	{
		this.a=a;
		this.b=b;
		this.x=x;
		this.y=y;
		
	}
	public float getAdd()
	{
		sum=a+b+x+y;
		return sum;
	}

}
