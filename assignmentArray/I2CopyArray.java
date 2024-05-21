package assignmentArray;

import java.util.Arrays;

public class I2CopyArray 
{
	
	public static void main(String[] args) 
	{
		int[] num = {1,2,3,5,8,25,65,35,685,865,865};
		
		int[] newnum = Arrays.copyOf(num, num.length);
		
		System.out.println("num array"+Arrays.toString(num));
		System.out.println("copy New num array from num"+Arrays.toString(newnum));
	}
	
}
