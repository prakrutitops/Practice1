package assignmentArray;

import java.util.Arrays;

public class A4SortingArray 
{
	public static void main(String[] args) 
	{
		int num[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		System.out.println("Original Array: "+Arrays.toString(num));
		
		
		//Sorting process
		Arrays.sort(num);
		System.out.println("Array after segregation is: "+Arrays.toString(num));
		
	}
}
