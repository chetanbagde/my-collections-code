package lambdaExpression;

import java.util.Optional;

public class C {
	int x=89;
	
public static void main(String args[]) {
	
	C c1= new C();
	
	Optional<C>v= Optional.ofNullable(c1);
	
	if(v.isPresent()) {
		
		System.out.println("not nullable");
	}
		else {
			
			System.out.println("nullable");
		}
		
		}


		
		
	}

