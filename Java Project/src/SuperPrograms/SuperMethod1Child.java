package SuperPrograms;

public class SuperMethod1Child extends SuperMethod1 
{
	int ans;
	public void add(int x,int y)
	{
		super.add(13,98);
		ans=x+y;
		System.out.println("child sum "+ans);
	}
	public static void main(String[] args) 
	{
		SuperMethod1Child obj=new SuperMethod1Child();
		obj.add(10,20);
	}

}
