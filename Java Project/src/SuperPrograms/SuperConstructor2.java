package SuperPrograms;

public class SuperConstructor2 extends SuperConstructor
{
	int ans;
	public SuperConstructor2(int x, int y) 
	{
		super(20,40);
		ans=x+y;
		System.out.println("Child Constructor answer= "+ans);
	}

	
	public static void main(String[] args) 
	{
		SuperConstructor2 obj=new SuperConstructor2(30,50);
		
	}

}
