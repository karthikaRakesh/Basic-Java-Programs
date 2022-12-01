package interfacePrograms;

public class HDFC implements Rbi
{
	float interestrate=6.5f,interest,total;
	public void recurringDeposit(long amount,int duration)
	{
		System.out.println("RD amount:" + amount);
		System.out.println("RD duration: " +duration+" Months");
		interest=(amount*duration*interestrate)/100;
		System.out.println("RD Interest Amount: " +interest);
		total=(interest+amount)*duration;
		System.out.println("Matured Amount is : " +total);
		
	}
	public static void main(String[] args) 
	{
		HDFC obj=new HDFC();
		obj.recurringDeposit(1000,12);

	}

}
