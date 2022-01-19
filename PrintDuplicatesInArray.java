package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set arr_set = new HashSet();
		Set dup_Set = new HashSet();
		
		for( int i : arr)
		{
			boolean value = arr_set.add(i);
			if(value)
				{ 
				arr_set.add(i);
				}
			else
			{
			   dup_Set.add(i);	
			}
				
		}
		System.out.println("The duplicate set is "+dup_Set);
	

	}

}
