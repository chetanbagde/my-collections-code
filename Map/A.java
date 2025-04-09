package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> map=new HashMap();
		
		map.put(null,"chetan");
		map.put(102,"null");
		map.put(103,"");
		map.put(104, "null");
		map.put(105, "null");
		
//		System.out.println(map);				
//		map.clear();
//		System.out.println(map);
//		
//		
//		
//		System.out.println(map.containsKey(105));
		
//		System.out.println(map.get(102));
//		
//		map.remove(101);
//		System.out.println(map);
//		
//		map.replace(102, "ravi");
//		System.out.println(map); 
//		
//		
//		System.out.println(map.size());
		
		System.out.println(map);
		
		Set<String> set = new HashSet<>();
		set.add("akashkhadse");
		set.add("deepubhaii");

		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

		
		
	}

}
