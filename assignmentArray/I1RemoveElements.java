package assignmentArray;

import java.util.ArrayList;
import java.util.Iterator;

public class I1RemoveElements 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DCD");
		list.add("ADX");
		list.add("HDS");
		list.add("HDHD");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// remove elements
		list.remove(4);
		Iterator itr2 = list.iterator();
		
		System.out.println("\nAfter Delete Index 4:\n");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
