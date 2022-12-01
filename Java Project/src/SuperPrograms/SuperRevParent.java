package SuperPrograms;

public class SuperRevParent 
{
	int reverse = 0, temp;  
	public void calrev(int number)
	{	
		temp=number;
		System.out.println("The number is: " + temp);
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
}
