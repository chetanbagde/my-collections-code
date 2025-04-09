package package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B {
	
	public static void main(String args[]) {
		
		Set<String>arr=new HashSet<>();
		
		arr.add("india");
		arr.add("USA");
		arr.add("UK");
		arr.add("china");
		arr.add("India");
		
		System.out.println(arr.size());
		
		Iterator<String> itr=arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
