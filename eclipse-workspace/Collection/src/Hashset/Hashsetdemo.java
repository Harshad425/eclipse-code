package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {
		//HashSet myset = new HashSet();

		//Set myset1= new HashSet();
		
		//HashSet<String> myset = new HashSet<String>();

		HashSet myset = new HashSet();

		
		// adding element into the hashset
		
		myset.add(104);
		myset.add(55.5);
		myset.add("value");
		myset.add("null");
		myset.add(1004);
		myset.add(null);
		myset.add(true);
		
		System.out.println(myset);
		
		// size of hashset
		
		System.out.println(myset.size());
		
		// Removing value hashset 
		myset.remove(55.5);
		System.out.println(myset);
		
		// insert element - not possible
		
		// acccess specific value - not possible
		
		// convert hashset to arraylist
		
		ArrayList ai= new ArrayList(myset);
		
		System.out.println(ai);
		System.out.println(ai.get(2));
		
		// for each loop for value 
		
		/*for (Object x : myset)
		{
			System.out.println(x);
			
		}*/
		
		Iterator it= myset.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
	}

}
