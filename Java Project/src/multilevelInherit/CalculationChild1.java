package multilevelInherit;

public class CalculationChild1 extends CalculationParent
{
	int ans;
	public void sub(int a, int b)
	{
		ans=a-b;
		System.out.println("Difference = " +ans);
	}

}
