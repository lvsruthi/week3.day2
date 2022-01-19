package week3.day2;

//import org.apache.commons.lang3.StringUtils;


public class Palindrome {
/*** a) Declare A String value as"madam"

* b) Declare another String rev value as ""
* c) Iterate over the String in reverse order
* d) Add the char into rev
* e) Compare the original String with the reversed String, if it is same then print palinDrome **/
	
	public static void main(String args[])
	{
		String name ="aadha ahdaa";
	    int size= name.length();
	    int flag=1;
		for(int i=0;i<=size/2; i++)
		{
			if(name.charAt(i)== name.charAt(size-1-i))
				continue;
			else
				flag=0;
			
		}
		if(flag==1)
		System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
		
	}

	
}
