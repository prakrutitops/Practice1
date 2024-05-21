package assignmentArray;

import java.util.Arrays;

public class B11ArraySort
{
	public static void main(String[] args) 
	{
		int[] num = {356,214,180,190,23,35,50,225,956,1000,723};
		System.out.println("Original Integers before sort "+Arrays.toString(num)+"\n");
		Arrays.sort(num);
		System.out.println("After sort"+Arrays.toString(num)+"\n");
		
		String[] str = {"orange","dcd","adv","zen","apple","pine","carrot"};
		System.out.println("Original String before sort "+Arrays.toString(str)+"\n");
		Arrays.sort(str);
		System.out.println("After sort"+Arrays.toString(str)+"\n");
	}
}
