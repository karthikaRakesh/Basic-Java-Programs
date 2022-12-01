package multilevelInherit;

public class SalaryDetails3 extends SalaryDetails2
{
	float salary;
	public void salcal()
	{
		salary=basic_pay+(hra-pf-deduction)+bonus;
	}
	public void salDetails()
	{
		System.out.println("SALARY DETAILS");
		System.out.println("**************************");
		System.out.println("Basic Pay : " + basic_pay);
		System.out.println("bonus : " + bonus);
		System.out.println("deduction : " + deduction);
		System.out.println("hra : " + hra);
		System.out.println("pf : " + pf);	
		System.out.println("Total salary : " +salary);
	}
	public static void main(String[] args) 
	{
		SalaryDetails3 obj=new SalaryDetails3();
		obj.cal();
		obj.salcal();
		obj.salDetails();
	
	}

}
