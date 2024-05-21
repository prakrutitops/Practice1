package assignmentArray;

public class A2AverageExcMinmax 
{
	public static void main(String[] args) 
	{
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int min = num[0]; 
		int max = num[0];
		float sum = num[0];
		
		for(int i = 1; i < num.length; i++)
		{
			sum += num[i];
			if(num[i] > max)
				max = num[i];
			else if(num[i] < min)
			min = num[i];
		}
		float avg = ((sum - min - max)/(num.length-2));
		System.out.println("Avg after excluded min max num is:"+avg);
	}
}
