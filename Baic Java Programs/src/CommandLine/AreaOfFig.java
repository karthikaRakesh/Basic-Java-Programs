package CommandLine;

public class AreaOfFig
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int area=a*b;
		System.out.println("Area" +area);
	}

}
