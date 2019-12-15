package review.remind;

class MethodFather {
	final int a = 10;
		MethodFather(){
			System.out.println("나는 아빠");
		}
		MethodFather(int a){
			System.out.println("나는 아빠" + a);
		}
}


public class MethodTest2 extends MethodFather {
	int a = 100;
		MethodTest2(){
			System.out.println("나는 아들");
		}
		MethodTest2(int a){
			System.out.println("나는 아들" + a);
		}
		
	public void setNum(int c, int d) {
		MethodTest2 mt = new MethodTest2();
		int a = 1000;
	}
	public int getNum() {
		MethodFather mt = new MethodTest2();
		int a = 1000;
		return a;
	}
	
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2(1);
		MethodFather mF = new MethodFather(1);
		mt.setNum(1,2);
		System.out.println(mt.a);
		System.out.println(mt.getNum());
		
	}
	
}
