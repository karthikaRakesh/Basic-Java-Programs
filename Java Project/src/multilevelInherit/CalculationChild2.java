package multilevelInherit;

public class CalculationChild2 extends CalculationChild1
{
	float ans;
	public void mod(int x,int y)
	{
		ans=x%y;
		System.out.println("Modulus = " +ans);
	}

	public static void main(String[] args) 
	{
		
		CalculationChild2 obj=new CalculationChild2();
		obj.mod(2,10);
		obj.sub(20,10);
		obj.add(20,30);
	}

}
