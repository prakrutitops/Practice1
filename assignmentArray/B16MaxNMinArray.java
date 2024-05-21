package assignmentArray;

public class B16MaxNMinArray 
{
	public static void main(String[] args) 
	{
		int[] num = {101,102,103,104,105,106};
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] >= max)
			{
				max = num[i];
			}
			if(num[i] <= min)
			{
				min = num[i];
			}
		}
		System.out.println("Max Array num is:"+max);
		System.out.println("Min Array num is:"+min);
		
	}
}
