package abstractPrograms;

public class Fac1Ext extends Fac1
{
	int fa=1,i;
	public void faccal(int num)
	{
		for(i=1;i<=num;i++)
		{
			fa=fa*i;
		}
		System.out.println("Factorial is: " +fa);
		
	}
	public static void main(String[] args) 
	{
		Fac1Ext obj=new Fac1Ext();
		obj.faccal(5);
		obj.disp("Karthika");

	}

}
