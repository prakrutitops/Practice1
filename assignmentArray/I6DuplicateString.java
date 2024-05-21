package assignmentArray;

public class I6DuplicateString
{
	public static void main(String[] args) 
	{
		 String str[] = {"abc","abc","dca","ddd","aa","aa","yy","zz","zz"};
		 
		 for(int i = 0; i <str.length-1; i++)
		 {
			 for(int j = i+1; j < str.length; j++)
			 {
				 if((str[i] == str[j]) && (i != j) )
				 {
					 System.out.println("Duplicate Elemets:"+str[j]);
				 }
			 }
			 
		 }
	}
}
