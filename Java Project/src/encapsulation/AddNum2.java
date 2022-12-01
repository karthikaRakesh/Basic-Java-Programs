package encapsulation;

public class AddNum2
{

	public static void main(String[] args) 
	{
		AddNum obj=new AddNum();
		obj.setAdd(2, 30, 40.560f, 2.090f);
		System.out.println("sum : " + obj.getAdd());

	}

}
