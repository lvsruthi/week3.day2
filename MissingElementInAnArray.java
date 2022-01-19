package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String Args[])
	{
		Integer[] arr = {1,2,3,4,7,6,8,5};
		int length = arr.length;
        List<Integer> arr_list = Arrays.asList(arr);
        Collections.sort(arr_list);
        int lastnumber = arr_list.get(length-1);
        System.out.println(lastnumber);
        int j=1;
        for(int i:arr_list)
        {
        	if(i==j)
        		{j++;
        		continue;
        		}
        	else
        		break;
        		
        }
        if(j>=lastnumber)
		   System.out.println("There is no missing numbers");
        else 
        	System.out.println("The missing number is "+j);
		
		
	}
	
	
}
