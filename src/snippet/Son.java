package snippet;

class GrandFa {
	void test1() {
		System.out.println("할아버지!");
	}
	void test2() {
		System.out.println("할아버지거");
	}
	
	void test4() {
		System.out.println("할아버지의 시크릿");
	}
}

class Father extends GrandFa {
	void test1() {
		System.out.println("아빠");
	}
}

public class Son extends Father {
	void test1() {
		System.out.println("아들!");
	}
	
	void test2() {
		System.out.println("아들거");
	}
	
	void test3() {
		System.out.println("아들의 시크릿");
	}
	
	public static void main(String[] args) {
		GrandFa ex = new Son();
		ex.test2();
		
		GrandFa t = new Son();
		Son t1 = (Son)t;
		t1.test4();

	}
}