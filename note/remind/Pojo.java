package review.remind;

public class Pojo {
	int a;
	int b;
	String result;
	
	void setNum(int x, int y) {
		this.a = x;
		this.b = y;
		this.result = "안뇽";
	}
	public String getNum() {
		
		this.result = a + b + "";
		
		return result; 
	}
	public String getNum2() {
		
		this.result = (a*2) + (b*2) + "";
		
		return result; 
	}
	
	public static void main(String[] args) {
		Pojo pj = new Pojo();
		pj.setNum(3, 4);
		pj.getNum();
		pj.getNum2();
		System.out.println(pj.result);
	}
}