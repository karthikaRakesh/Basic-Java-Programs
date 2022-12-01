package encapsulation;

public class ReverseEnc 
{
	private int number,reverse=0;
	public int getNumber() 
	{
		System.out.println("The number is: " + number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10; 
		}  
		
		return reverse;
	}
	public void setNumber(int number) 
	{
		this.number = number;	
	}

}
