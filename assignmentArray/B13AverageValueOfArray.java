package assignmentArray;

public class B13AverageValueOfArray 
{
	public static void main(String[] args) 
		{
			int sumarray[] = {123,25,321,255,265,235,324,265,265,652};
			int sum = 0;
			for(int i = 0; i < sumarray.length; i++)
			{
				sum += sumarray[i];
			}
			sum /= sumarray.length;
			System.out.println(sum);
		}
}


