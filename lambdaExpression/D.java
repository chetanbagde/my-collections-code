package lambdaExpression;

import java.util.Optional;

public class D {
	
	int x=90;
	
	public static void main(String args[]) {
		
		D d1=new D();
		
	Optional<D>v=Optional.ofNullable(d1);
	   
	if(v.isPresent()) {
		
		System.out.println("nullable");
		
	}else {
		System.out.println("it is not nullable");
	}
	
	 
	
		
		
	
	}

}
