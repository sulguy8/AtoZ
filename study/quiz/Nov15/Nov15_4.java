package Nov15;

class Parent {
	public void test() {
		System.out.println("Parent!");
	}

	public void test(int a) {
		System.out.println("Parent!");
	}
}

public class Nov15_4 extends Parent {
	public void test(int a) {
		System.out.println("Children");
	}

	public String toString() {
		return "Children";
	}
	
	public static void main(String[] args) {
		Parent p = new Nov15_4();
		p.test();
		p.test(1);
		System.out.println(p);
		p = new Parent();
		p.test(2);
	}
}
