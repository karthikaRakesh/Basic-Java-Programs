package encapsulation;
public class ReverseEnc2 
{
	private int i,fact=1,num;
	public int getFac() 
	{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public void setFac(int num)
	{	
		this.num=num;
	}
		

	public static void main(String[] args) 
	{
		ReverseEnc obj=new ReverseEnc();
		obj.setNumber(1234);
		System.out.println("Reversed : " +obj.getNumber());
		
		ReverseEnc2 obj1=new ReverseEnc2();
		obj1.setFac(5);
		System.out.println("Factorial = "+ obj1.getFac());

	}

}
