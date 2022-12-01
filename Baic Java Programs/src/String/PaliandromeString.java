package String;

public class PaliandromeString 
{
	String strvalue1 ="JAVA";
	String strvalue2 ="MALAYALAM";
	String strtemp1=strvalue1;
	String strtemp2=strvalue2;
	public void reverseJava()
	{	
		System.out.println("Original String : " + strtemp1);
		strvalue1= new StringBuffer(strvalue1).reverse().toString();
		System.out.println("Reversed String : " + strvalue1);
		if((strtemp1.equals(strvalue1)))
		{
			System.out.println("String is paliandrome");
		}
		else 
		{
		
			System.out.println("String is not Paliandrome");
		}
	}
	public void reversemala()
	{
		System.out.println("Original String : " + strtemp2);
		strvalue2= new StringBuffer(strvalue2).reverse().toString();  
		System.out.println("Reversed String : " + strvalue2);
		if((strtemp2.equals(strvalue2)))
		{
			System.out.println("String is paliandrome");
		}
		else 
		{
		
			System.out.println("String is not Paliandrome");
		}
	}
	public static void main(String[] args) 
	{    
		PaliandromeString obj=new PaliandromeString();
		obj.reverseJava();
		obj.reversemala();
		
	}	
}

 