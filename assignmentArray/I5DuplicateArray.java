package assignmentArray;

public class I5DuplicateArray 
{
	public static void main(String[] args) 
	{
		 int[] numbers = { 1, 2, 3, 4, 5,5, 6,6, 7, 8, 9, 10,10};
		 
		 for(int i = 0; i <numbers.length-1; i++)
		 {
			 for(int j = i+1; j < numbers.length; j++)
			 {
				 if((numbers[i] == numbers[j]) && (i != j) )
				 {
					 System.out.println("Duplicate Elemets:"+numbers[j]);
				 }
			 }
			 
		 }
	}
}
