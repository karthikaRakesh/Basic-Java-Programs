package SuperPrograms;

public class OffSeason 
{
	float total,discount,amount;
	public void discount(float p1,float p2,float p3,float p4,float p5)
	{
		total=p1+p2+p3+p4+p5;
		discount=(total*15)/100;
		amount=total-discount;
		System.out.println("Offseason with 15% discount");
		System.out.println("------------------------------------");
		System.out.println("Total cost: " + total);
		System.out.println("discount: " +discount);
		System.out.println("The final amount to pay: " +amount);
	}

}
