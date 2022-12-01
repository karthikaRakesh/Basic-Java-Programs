package String;

public class Fib {

	public static void main(String[] args) {
		
				int num1=0,num2=1,fib,i;
				System.out.println(num1);
				System.out.println(num2);
				for(i=2;i<8;i++)
				{
					fib=num1+num2;
					num1=num2;
					num2=fib;
					System.out.println(fib);
				}
				
			}
		

	}
