package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String args[])
	{   
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		Set<Integer> Array1 = new HashSet<Integer>();
		Array1.add(3);
		Array1.add(2);
		Array1.add(11);
		Array1.add(4);
		Array1.add(6);
		Array1.add(7);
		Set<Integer> Array2= new HashSet<Integer>();
		Array2.add(1);
		Array2.add(2);
		Array2.add(8);
		Array2.add(4);
		Array2.add(9);
		Array2.add(7);
		Integer number_array[]= Array2.toArray(new Integer[Array2.size()]);
		Set<Integer> result = new HashSet<Integer>();
		for(Integer num : number_array)
		{
			boolean ispresent = Array1.add(num);
			if(ispresent)
				continue;
			else
				result.add(num);
			
		}
		System.out.println(result);
		

	}
	
	
	
}
