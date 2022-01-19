package week3.day2;

//import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] data = {3,2,11,4,6,7};
		int length = data.length;
		ArrayList <Integer> data_list = new ArrayList<Integer>();
		for (int e : data)
	    data_list.add(e);
		
/*		List data_list = Arrays.asList(data);*/
		
		
		Collections.sort(data_list);
		System.out.println(data_list.get(length-2));
		
		
		
		

	}

}
