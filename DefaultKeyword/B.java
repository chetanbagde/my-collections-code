package DefaultKeyword;

public class B implements A{
	
	
	
	public static void main(String args[]) {
		
		B b1=new B();
		 b1.test();
		 b1.method();
		 
		
		
	}

	@Override
	public void method() {
		System.out.println("incomplete methods");
		
	}

}
