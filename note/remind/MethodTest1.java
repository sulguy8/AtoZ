package review.remind;

import oracle.net.ano.SupervisorService;

class Test2 {
	static int a = 10;

	
	Test2() {
		System.out.println("가");
	}

	
	void stst() {
		
	}
}

public class MethodTest1 extends Test2 {
	int a = 4;

	MethodTest1() {
		System.out.println("다" + super.a);
	}
	
	MethodTest1(String a){
		System.out.println("라");
	}
	
	public static void main(String[] args) {
		MethodTest1 t1 = new MethodTest1();
		Test2 t2 = new Test2();
		
	
		

	}	
}
