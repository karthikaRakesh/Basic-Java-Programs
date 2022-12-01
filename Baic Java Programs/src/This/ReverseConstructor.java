package This;

public class ReverseConstructor 
{
	int reverse = 0;
	public ReverseConstructor(int number)
	{	
		System.out.println("The number is: " + number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10; 
		}  		 
	}
	public ReverseConstructor()
	{	
		this(1234);
		System.out.println("The reverse of the given number is: " + reverse); 
	}
	
	public static void main(String[] args) 
	{
		ReverseConstructor obj=new ReverseConstructor();

	}

}
