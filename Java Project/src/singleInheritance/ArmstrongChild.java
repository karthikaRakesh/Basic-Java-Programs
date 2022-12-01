package singleInheritance;

public class ArmstrongChild extends ArmstrongParent
{
	public void cal(int number)
	{
		check=number;
		while(check!=0)
		{
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		System.out.println("given number=" +sum);
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
		ArmstrongChild obj=new ArmstrongChild();
		obj.cal(153);
	}

}
