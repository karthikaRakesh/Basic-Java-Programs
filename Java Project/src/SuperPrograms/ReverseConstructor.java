package SuperPrograms;

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

}
