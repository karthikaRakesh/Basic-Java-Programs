package abstractPrograms;

public class MulCalAbstract2 extends MulCalAbstract
{
	int revesre=0;
	int i,fact=1;
	public void rev(int number)
	{
		System.out.println("The number want to reverse is: " + number);
		while(number != 0)   
			{  
			int remainder = number % 10;  
			revesre = revesre * 10 + remainder;  
			number = number/10; 
			}
		System.out.println("Revesed number : " +revesre);
	}
	public void fac(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ num +" = "+fact);
	}
	public void arms(int number)
	{
		int check,rem,sum=0;
		System.out.println("Given Number for amstrong=" +number);
		check=number;
		while(check!=0)
		{
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		System.out.println("got number for armstrong=" +sum);
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
		MulCalAbstract2 obj=new MulCalAbstract2();
		obj.rev(1234);
		obj.fac(5);
		obj.arms(153);
		
	}

}
