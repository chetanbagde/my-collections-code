package collection;

import java.util.ArrayList;
import java.util.List;

public class C {
	
	public static void main(String args[]) {
		
		List<Integer>list=new ArrayList<>();
		
		ArrayList a1=new ArrayList<>();
		
		list.add(44);
		list.add(90);
		list.add(23);
		list.add(45);
		
		for(int i=0;i<list.size(); i++) {
}
		for(Integer obj:list) {
			System.out.println(obj);
		}
	}

}
