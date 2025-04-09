package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class B {
	
	public static void main(String args[]) {
		
		ArrayList <Integer>a1=new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		 
		System.out.println(a1);
		
		//for(int i=0; i<a1.size();i++)
		
		//System.out.println(a1.get(i));
		
		//for each loop
		for(int arr : a1) {
            System.out.println(arr);
        }
		
		for(Object obj:a1) {
			System.out.println(obj);
		}
		
		for(Integer arr:a1) {
			
			System.out.println(arr);
		}
	
		
		//approach-3
		
	     Iterator iterator=a1.iterator();
	     
	     while(iterator.hasNext()) {
	    	 System.out.println(iterator.next());
	     }
	     
	 ListIterator listIterator=a1.listIterator();
	 
	 while(listIterator.hasNext()) {
		 System.out.println(listIterator.next());
	    
	     
	     }
	     
	     
	}

}
