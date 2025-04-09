package abstractClass;

public class B extends A {
	
	public static void main(String args[]) {
		
		B b1=new B();
		
		b1.test();
		b1.test1();
		
	
	}

	@Override
	public void test() {
		
		System.out.println("incomplete methods complete it");
		
	}
	}
