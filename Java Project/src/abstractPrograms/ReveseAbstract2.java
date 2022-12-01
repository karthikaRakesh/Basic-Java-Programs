package abstractPrograms;

public class ReveseAbstract2 extends ReveseAbstract
{
	int revesre=0;
	public void cal(int number)
	{
		System.out.println("The number is: " + number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		revesre = revesre * 10 + remainder;  
		number = number/10; 
		}
		System.out.println("Revese : " +revesre);
	}
	public static void main(String[] args) 
	{
		ReveseAbstract2 obj=new ReveseAbstract2();
		obj.cal(1234);

	}

}
