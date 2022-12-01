package abstractPrograms;

public class PalPersonalDetAbs2 extends PalPersonalDetAbs
{
	int revesre=0,temp;
	public void pal(int number)
	{
		temp=number;
		System.out.println("The number want to reverse is: " + number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		revesre = revesre * 10 + remainder;  
		number = number/10; 
		}
		System.out.println("Revesed number : " +revesre);
		if(temp == revesre)
		{
		System.out.println("The number is Paliadrom ");  	
		}	
		else
		{
		System.out.println("The number is not Paliadrom");  
		} 
		
	}
	public void details(String name,int age,String dob,String gender,String marstat)
	{
		System.out.println("------------------------");
		System.out.println("Personal Details");
		System.out.println("------------------------");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Date of Birth : " +dob);
		System.out.println("Gender : " +gender);
		System.out.println("Marital Status : " +marstat);
		
	}
	public static void main(String[] args) 
	{
		PalPersonalDetAbs2 obj=new PalPersonalDetAbs2();
		obj.pal(1234);
		obj.details("Karthika Rakesh", 29, "11/05/1991", "Female", "Married");
	}

}
