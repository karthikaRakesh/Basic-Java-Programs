package encapsulation;

public class Fac1 
{
	private int num,fa=1,i;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		for(i=1;i<=num;i++)
		{
			fa=fa*i;
		}
		System.out.println("Factorial is: " +fa);
		return fa;
	}
}
