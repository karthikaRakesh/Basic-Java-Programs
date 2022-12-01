package aggregation;

public class CostomerDetails2 
{
	float prod_Price1,prod_Price2,prod_Price3,prod_Price4,prod_Price5,total_Amt,discount,final_amount;
	CustomerDetails1 cstmr;
	public void cal1(float prod_Price1,float prod_Price2,float prod_Price3,float prod_Price4, float prod_Price5,CustomerDetails1 cstmr)
	{
		this.prod_Price1=prod_Price1;
		this.prod_Price2=prod_Price2;
		this.prod_Price3=prod_Price3;
		this.prod_Price4=prod_Price4;
		this.prod_Price5=prod_Price5;
		this.cstmr=cstmr;
	}
	public void cal2()
	{
		System.out.println("Costomer Id : "+cstmr.cost_Id);
		System.out.println("Costomer Name : "+cstmr.cost_Name);
		System.out.println("Costomer Mobile Number: " +cstmr.ph_Num);
		System.out.println("Purchase Date: " +cstmr.date_Purchase);
		System.out.println("1st Product's Price : "+prod_Price1);
		System.out.println("2nd Product's Price : "+prod_Price2);
		System.out.println("3rd Product's Price : "+prod_Price3);
		System.out.println("4th Product's Price : "+prod_Price4);
		System.out.println("5th Product's Price : "+prod_Price5);
		
		total_Amt= prod_Price1+prod_Price2+prod_Price3+prod_Price4+prod_Price5;
		System.out.println("Total Amount: "+total_Amt);
		if(total_Amt>=2000) 
		{
			discount=(total_Amt*20/100);
			System.out.println("Discount Amount: " +discount);
			final_amount=total_Amt-discount;
			System.out.println("Final Amount to pay : "+final_amount);
			System.out.println("********************************************************************************");
		}
		else
		{
			System.out.println("Not Eligible for the discount");
			System.out.println("Final Amount to pay : "+total_Amt);
			System.out.println("********************************************************************************");
		}
		
	}
	public static void main(String[] args)
	{
		CustomerDetails1 obj1=new CustomerDetails1();
		obj1.details1("Karthika Rakesh", "23451Et",987876542, "22/03/19");
		CostomerDetails2 obj11=new CostomerDetails2();
		obj11.cal1(233.3f, 2230f, 2344f, 500f, 230f, obj1);
		obj11.cal2();
		
		CustomerDetails1 obj2=new CustomerDetails1();
		obj1.details1("Riya", "12ERFE",726438647, "28/03/12");
		CostomerDetails2 obj21=new CostomerDetails2();
		obj21.cal1(23.3f, 20f, 244f, 50f, 20f, obj2);
		obj21.cal2();
		
		CustomerDetails1 obj3=new CustomerDetails1();
		obj3.details1("Parvathy", "45ERRE",987876542, "28/05/10");
		CostomerDetails2 obj31=new CostomerDetails2();
		obj31.cal1(233.3f, 230f, 234f, 500f, 230f, obj3);
		obj31.cal2();
	}

}
