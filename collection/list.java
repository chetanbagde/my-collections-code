package collection;

import java.util.ArrayList;
import java.util.List;

public class list {
	
	public static void main(String args[]) {
		
		List<String>list=new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		
		list.add(1,"xxx");
	    list.set(2, "abc");
		
		
		
		
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		System.out.println(list.removeLast());
		
		System.out.println(list);
		
		
		
			
		}
		
	}


