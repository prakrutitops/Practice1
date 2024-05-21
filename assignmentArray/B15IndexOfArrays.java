package assignmentArray;

import java.util.Arrays;

public class B15IndexOfArrays 
{
	public static int findindex(int[] num, int indexnum) 
	{
		for(int i = 0; i < num.length; i ++)
		{
			if(num[i] == indexnum)
			{
				return i;
			}
			else
				System.out.println("Not found");
			break;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		int[] num = {101,102,103,104,105,106};
		
		System.out.println(findindex(num, 1008));
		
	}
}

