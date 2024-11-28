package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntry_example {

	public static void main(String[] args) {


		
		HashMap <Integer, String> hp = new HashMap<>();
		
		
		hp.put(1, "India");
		hp.put(2, "Pak");
		hp.put(3, "Aus");
		hp.put(4, "Eng");
		hp.put(5, "NZ");
		hp.put(null, "Ban");
		hp.put(null, null);
		hp.put(6, null);
		
		System.out.println(hp);
		System.out.println(hp.get(4));
		System.out.println(hp.keySet());
		System.out.println(hp.entrySet());
		
		  // iterating the key value pair using for each loop
        for (Map.Entry<Integer, String> entry :hp.entrySet()) 
        {
            Integer key = entry.getKey();
            String value = entry.getValue();
 
            System.out.println(key + "=" + value);
        }
        
        // iterating the key-value pairs using iterator
        Iterator<Map.Entry<Integer, String> > itr = hp.entrySet().iterator();
       
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}

}
