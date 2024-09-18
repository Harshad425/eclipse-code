package Arraylistmethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListdemo {

	public static void main(String[] args) {

		
		
		
		// list ab= new Arraylsit();
		
		
		//	 Arraylist <Integer> ab =new Arraylist <Integer> ();
				
			// Arraylist <String> ab =new Arraylist <String> ();
				
		// 	Arraylist <Employee> ab =new Arraylist <Employee> ();
				
		//	Arraylist <object> ab =new Arraylist <object> ();
			
			
		ArrayList ab=new ArrayList();
			
			// adding data into the arraylist 
			
		 
		ab.add(100);
		ab.add(44.5);
		ab.add('A');	
		ab.add("Welcome");
		ab.add(true);
		ab.add(null);
		ab.add(100);
		ab.add(null);
			
		// size or aaraylist
		System.out.println("Array size is : "+ab.size());
		
		
		// showing or print data by system method
		
		System.out.println(" print data by system : " + ab);
		
		
		// remove elemetn from aaray : remove(i);
		
		ab.remove(2);
		System.out.println(" remove element : " + ab);
		//System.out.println(" after remove : " + ab);
		
		
		// inser eliment in array : add(i,value)
		ab.add(4,"java");
		System.out.println("inser eliment: "+ab);
		
		
		// modify or change or inter value
		
		ab.set(4, "python");
		System.out.println("modify or change  value: "+ab);
		
		// acess specic value from arraylist by index and method
		
	
	System.out.println("acess specic value from arraylist: "+ab.get(2));
		
		
	
	// using for loop show value of array
	
	/*int i;
	
	for( i=0;i<ab.size();i++)
	{
		System.out.println(ab.get(i));
		
	}*/
		
	// using for for each loop show value of array
	
	/*for (Object Kd:ab) 
		{
		System.out.println(Kd);

		}*/
		
		// using  iterator 

		
	Iterator< Integer > itt=ab.iterator();
		
	while(itt.hasNext())
	{
		System.out.println(itt.next());
	}
	
	// cheking empty
	
	System.out.println(ab.isEmpty());
	
	//remove array
	
	ArrayList ab1=new ArrayList();
	
	
	ab1.add("Welcome");
	ab1.add(100);
ab.removeAll(ab1);
	System.out.println(ab);
	
	 
	
	// remove all 
	
	//ab.clear();
	//System.out.println(ab.isEmpty());
	
	
	
	
	
	
	}

}
