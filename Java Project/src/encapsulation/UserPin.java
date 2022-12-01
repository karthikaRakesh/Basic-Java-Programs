package encapsulation;

public class UserPin 
{
	private int pin;
	public void setPinUser(int pin)
	{
		this.pin=pin;
		
	}
	public int getPinVal()
	{
		if((pin==1212)||(pin==1000)||(pin==1234))
		{
			System.out.println("Your Pin Number is correct");
			System.out.println("Please Withdraw Money");
		}
		else
		{
			System.out.println("Invalid pin Entered");
			System.out.println("Please try again!!!");
		}
		return pin;
	}
}
