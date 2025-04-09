package FunctionalInterface;

public class B implements A {
	
	public static void main(String args[]) {
		
        B b1=new B();
		
		b1.test();
		
		
		
	}

	@Override
	public void test() {
		System.out.println("complete method in class");
	}

	

}
