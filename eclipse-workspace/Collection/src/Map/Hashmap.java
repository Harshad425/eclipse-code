package Map

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
		
		
		//HashMap hm=new HashMap();
		HashMap<Entry<Integer,String> >hm=new HashMap<Entry<Integer,String> >();
		// Map hm=new HashMap();
		
		
		// adding pair
		
		hm.put(1, "ajay");
		hm.put(2, "rahul");
		hm.put(3, "ketan");
		hm.put(4, "tejal");
		hm.put(2, "jayu");
		
		System.out.println(hm);
		
		// size of hashmap
		
		System.out.println(hm.size());
		
		
		// remove value
		hm.remove(2);
		System.out.println(hm);
		
		// access particular value
		System.out.println(hm.get(3));
		
		
		// get all the value in pair or entry
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		// reading dara for hashmap
		
		/*for ( int k : hm.keySet()) {
			System.out.println(k+ " "   + hm.get(k));*/

		}
		// iterator data 
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()){
			
		Entry<Integer, String> entry = it.next();
		System.out.println(entry.getKey() + entry.getValue());

		}
	    

}
	     }
