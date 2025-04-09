package p2;

import java.util.ArrayList;

public class A {
	
	public static void main(String args[]) {
		
		//ArrayList<Integer> arr=new ArrayList<>();
		ArrayList arr=new ArrayList();
		
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(100);
		
		arr.add("badal");
		
	    arr.add(0,900);
		
		System.out.println(arr.indexOf(400));
		System.out.println(arr.lastIndexOf(100));
		
		System.out.println(arr.contains(400));
		
		
		
		System.out.println(arr);
		
		System.out.println(arr.size());
	
		
		
		
	}

}
