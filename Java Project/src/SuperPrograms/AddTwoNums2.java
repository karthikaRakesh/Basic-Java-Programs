package SuperPrograms;

public class AddTwoNums2 extends AddTwoNums
{
	public void cal()
	{
		super.add(20, 30);
		if((sum%10)==0)
		{
			System.out.println("Answer divisible by 10");
		}
		else
		{
			System.out.println("not divisible by 10");
		}
	}

	public static void main(String[] args)
	{
		AddTwoNums2 obj=new AddTwoNums2();
		obj.cal();

	}

}
