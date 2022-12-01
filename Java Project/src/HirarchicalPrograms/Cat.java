package HirarchicalPrograms;

public class Cat extends Animal
{
	public void mew()
	{
		System.out.println("mew.....");
	}

	public static void main(String[] args) 
	{
		Cat obj=new Cat();
		obj.eat();
		obj.mew();

	}

}
