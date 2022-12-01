package This;

public class AdditionThis
{
	int a,b,sum;
	public AdditionThis(int a1,int b1)
	{
		this.a=a1;
		this.b=b1;
		sum=a+b;
	}
	public void display()
	{
		System.out.println("Sum="  +sum);
	}

	public static void main(String[] args) 
	{
		AdditionThis obj=new AdditionThis(12,23);
		obj.display();

	}

}
