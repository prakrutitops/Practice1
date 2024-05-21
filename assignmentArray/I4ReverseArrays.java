package assignmentArray;

import java.util.Arrays;
import java.util.Collections;



public class I4ReverseArrays 
{
	public static void main(String[] args) 
	{
		 Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 System.out.println("Before Reverse:"+Arrays.toString(numbers));
		 Collections.reverse(Arrays.asList(numbers));
	 
		 System.out.println("Reverse Arrays:" +Arrays.asList(numbers)); 
	     
	}
}
