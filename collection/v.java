package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

	public class v {
		public static void main(String args[]) {
			
			Map<Integer,String>	m=new HashMap<>();
			
			m.put(1,"badal");
			m.put(2, "chetan");
			m.put(3, "bagde");
			
			System.out.println(m);
		
		//System.out.println(m.remove("9632629033"));
		//	System.out.println(m.get(3));
			
			Set<Integer>keys=m.keySet();
			
			for(Integer key : keys){
				System.out.println(m.get(key));
			}
			
			Set<Map.Entry<Integer,String>>entrySet=m.entrySet();
			
			for(Map.Entry<Integer,String>entry:entrySet) {
				
				
				System.out.println(entry);
				
				System.out.println(entry.getKey()+"--------"+entry.getValue());
			}
		
		

}
}
