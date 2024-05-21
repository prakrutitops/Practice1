package assignmentArray;

public class A1CommonArray 
{
	public static void main(String[] args) 
	{
		 String str[] = {"abc","abc","dca","ddd","aa","aa","yy","zz","zz"};
		 
		 for(int i = 0; i <str.length-1; i++)
		 {
			 for(int j = i+1; j < str.length; j++)
			 {
				 if((str[i] == str[j]))
				 {
					 System.out.println("Common Elemets:"+str[j]);
				 }
			 }
			 
		 }
	}
}
