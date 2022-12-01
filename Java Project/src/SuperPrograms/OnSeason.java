package SuperPrograms;

public class OnSeason extends OffSeason 
{
	float total,discount,amount;
	public void discount(float p1,float p2,float p3,float p4,float p5)
	{
		super.discount(300.00f, 456.78f, 786.89f, 345.56f, 345.56f);
		super.total=total;
		total=p1+p2+p3+p4+p5;
		discount=(total*40)/100;
		amount=total-discount;
		System.out.println("------------------------------------");
		System.out.println("Onseason with 40% discount");
		System.out.println("------------------------------------");
		System.out.println("Total cost: " + total);
		System.out.println("discount: " +discount);
		System.out.println("The final amount to pay: " +amount);
	}

	public static void main(String[] args) 
	{
		OnSeason obj=new OnSeason();
		obj.discount(300.00f, 456.78f, 786.89f, 345.56f, 345.56f);

	}

}
