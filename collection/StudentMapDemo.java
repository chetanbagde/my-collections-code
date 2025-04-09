package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapDemo {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"john");
		Student s2=new Student(102,"smith");
		Student s3=new Student(103,"orlen");
		
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		
		System.out.println(map);
		
		Set<Integer> keySet=map.keySet();
		for(Integer key:keySet) 			
			System.out.println(map.get(key));
		
       
	
			
	   }
	
		
		

}

