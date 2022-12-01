package abstractPrograms;

public class Contractor extends Employee
{
	int payment;
	public void calculateSalary(int pay,int hour) 
	{
		System.out.println("Payment Per Hour is "+pay);
		if(hour==8)
		{
			System.out.println("Your working hour 8 hours");
			payment=(pay*hour)*30;
			System.out.println("Your full Payment of the day is:  " +payment +" /-");
			
		}
		else if(hour<8)
		{
			System.out.println("Your working hour is less than 8 hours :" +hour);
			payment=(pay*hour)*30;
			System.out.println("Your full Payment of the day is: " +payment +" /-");
		}
		
		
	}

	public static void main(String[] args) 
	{
		Contractor obj=new Contractor();
		obj.calculateSalary(2000, 8);
	}

	
}
