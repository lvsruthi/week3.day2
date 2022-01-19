package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";
					str.trim();

				char charArray[] =str.toCharArray();
				int Array_length= charArray.length;
				int count = 0;
				
				for(int i =0;i<Array_length;i++)
				{
					if(charArray[i]=='n')
						count++;
					else
						continue;
					
				}
				System.out.println("The count is "+ count);
					
		

	}

}
