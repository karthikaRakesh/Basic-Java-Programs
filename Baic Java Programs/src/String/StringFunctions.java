package String;

public class StringFunctions 
{
		public static void main(String[] args)
		{
			String s1="Hello World";                   //Literally created
			String s2=new String("Welcome to JAVA");   // Created using new keyword
			
			System.out.println(s1.length());           //Gives the length of the string
			System.out.println(s2.length());
			
			s1=s1.concat(s2);
			System.out.println(s1);                    //concatenating two strings
			
			System.out.println(s1.charAt(0));          //To get the character of the particular index
			
			System.out.println(s1.substring(5));       //to get the substring from the given index
			
			System.out.println(s1.substring(5, 10));   //to get the substring between 5 and 10(including 5 and excluding 10)
			
			System.out.println(s1.contains(s2));       //return boolean value, check the string contains another string
			
			System.out.println(s1.equals(s2));	       //return boolean value, check two strings are equal or not
		
			System.out.println(s1.equalsIgnoreCase(s2));//return boolean value, check two strings are equal or not and ignore the alphabet case
			
			System.out.println(s1.isEmpty());           //return boolean value,check the string is empty or not
			
			//System.out.println(s2.replace(l, a));
			
			System.out.println(s2.intern());            //
			
			System.out.println(s1.indexOf(s2));			//
			
			System.out.println(s1.toLowerCase());		//change letters to lower case 
			
			System.out.println(s2.toUpperCase()); 		//change letters to upper case 
			
			System.out.println(s1.trim()); 				//Remove starting and ending white spaces
		}

}
