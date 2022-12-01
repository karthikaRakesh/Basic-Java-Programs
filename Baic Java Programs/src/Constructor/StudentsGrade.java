package Constructor;

public class StudentsGrade 
{
	int total,avg;
	public StudentsGrade(int mark1,int mark2,int mark3)
	{
		System.out.println("mark 1: " +mark1);
		System.out.println("mark 2: " +mark2);
		System.out.println("mark 3: " +mark3);
		total=mark1+mark2+mark3;
		System.out.println("Total marks :"+total);
		avg=total/3;
		System.out.println("Average mark :"+avg);
		if (avg>=80)
		{
			System.out.println("Grade A");
			System.out.println("*************************************");
		}
		else if(avg>=70)
		{
			System.out.println("Grade B");
			System.out.println("*************************************");
		}
		else if(avg>=40)
		{
			System.out.println("Grade C");
			System.out.println("*************************************");
		}
		else if(avg>=20)
		{
			System.out.println("Failed");
			System.out.println("*************************************");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Student Name: Karthika");
		StudentsGrade obj=new StudentsGrade(90,90,80);
		System.out.println("Student Name: Remya");
		StudentsGrade obj2=new StudentsGrade(50,70,60);

	}

}
