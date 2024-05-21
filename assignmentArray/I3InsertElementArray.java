package assignmentArray;

import java.util.ArrayList;
import java.util.Iterator;

public class I3InsertElementArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
				
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list.add(4, 5000);
		
		//after add at index 4 
		Iterator itr2 = list.iterator();
		System.out.println();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}
}
