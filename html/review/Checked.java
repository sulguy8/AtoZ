package review;

public class Checked {
	
	public String checkStr(String str, String targetStr){
		return "System.out.println(\"checked\")"; 
	}
	
	public static void main(String[] args) {
		Checked ck = new Checked();
		ck.checkStr("하이", "하이룽");
		
		
		
		System.out.println(ck.checkStr("1","2"));
	}
	
}
