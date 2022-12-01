package multilevelInherit;

public class SalaryDetails2 extends SalaryDetails1 
{
	float hra,pf;
	public void cal()
	{
		hra = (basic_pay*5)/100;
		pf = (basic_pay*20)/100;
		
	}
	
}
