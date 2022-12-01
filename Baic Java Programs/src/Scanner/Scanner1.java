package Scanner;
import java.util.Scanner;
public class Scanner1
{
	public static void main(String arg[])
	{
		Scanner age = new Scanner(System.in);  
	    System.out.print("Enter your age: ");    
	    int age1 = age.nextInt();  
	    System.out.println("Age: " + age1);
		
		Scanner name = new Scanner(System.in);  
	    System.out.print("Enter your name: ");    
	    String name1 = name.next();  
	    System.out.println("Name: " + name1);
		
	}
}