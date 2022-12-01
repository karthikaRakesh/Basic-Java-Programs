package abstractPrograms;

public class ArmstrongAstract2 extends ArmstrongAstract
{
	public void cal(int number)
	{
		int check,rem,sum=0;
		System.out.println("Given Number=" +number);
		check=number;
		while(check!=0)
		{
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		System.out.println("got number=" +sum);
		if(sum==number)
		{
			System.out.println("The given number is Armstrong");
		}
		else
		{
			System.out.println("The given number is not Armstrong");
		}
	}
	public static void main(String[] args) 
	{
		ArmstrongAstract2 obj=new ArmstrongAstract2();
		obj.cal(173);

	}

}
