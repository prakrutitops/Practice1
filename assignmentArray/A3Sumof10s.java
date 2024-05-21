package assignmentArray;

public class A3Sumof10s 
{
	public static void main(String[] args) 
	{
		int num[] = {10,50,25,10,35,75,10};
		int sum = 0;
		for(int i = 0; i <num.length; i++)
		{
			if(num[i] == 10)
			sum += num[i];
		}
		if(sum == 30)
			System.out.println("True");
		else
			System.out.println("False");
	}
	
}
