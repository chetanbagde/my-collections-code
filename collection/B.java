package collection;

import java.util.ArrayList;
import java.util.List;

public class B {
		
		public static void main(String[] args) {
			
			List<String> list=new ArrayList<>();
			
			list.add("badal");
			list.add("chetan");
			list.add("suresh");
			list.add("dinesh");
			list.add("90");
			
			
			
			
			System.out.println(list.contains("dinesh"));
			 
			
			System.out.println(list.indexOf("suresh"));
			
			System.out.println(list.remove("dinesh"));
			
			System.out.println(list);
			
			list.set(0, "akash");
			System.out.println(list);
			
			
			
			
				
				
			}
}
		
			
			
	
	
