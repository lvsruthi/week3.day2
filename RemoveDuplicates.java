package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	
	public static void main(String[] args)
	{
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
		
		
		String text = "We learn java basics as part of java sessions in java week1";	
		String TextArray[] = text.split(" ");
		ArrayList<String> TextSet = new ArrayList<String>();
		ArrayList<String> DuplicateSet = new ArrayList<String>();
		int length =TextArray.length;
		for(int i=0;i<length;i++)
		{
			if(TextSet.contains(TextArray[i]))
				DuplicateSet.add(TextArray[i]);
			else
				TextSet.add(TextArray[i]);
			
		}
		String Result[]= TextSet.toArray(new String[TextSet.size()]);
		for( String r : Result)
		{
			System.out.print(r);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println(TextSet);
		System.out.println(DuplicateSet);
		
					
	}

}
