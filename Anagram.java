package week3.day2;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
		String text1 ="uthse";
		String text2="sethu";
		int length1= text1.length();
		int length2=text2.length();
		int flag=1;
		if(length1!=length2)
		{
			flag=0;
		}
		else
		{
			
			char Text1_Array[]= text1.toCharArray();
			char Text2_Array[]= text2.toCharArray();
			Arrays.sort(Text1_Array);
			Arrays.sort(Text2_Array);
			
			System.out.println(Text1_Array);
			System.out.println(Text2_Array);
			
			for (int i=0;i<length1;i++)
			{
				if(Text1_Array[i]==Text2_Array[i])
					continue;
				else
				{
			       flag=0;
			       break;
				}
				
			}
			
		}
		
		if(flag==1)
			System.out.println("Values are same");
		else
			System.out.println("Values are not same");
  		
		
		
	}

}
