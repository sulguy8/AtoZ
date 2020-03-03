package designPattern.behavioral.template_method.ex;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등  접속 정보");
		// 원래 패키지를 달리해서 protected된 helper의 메소드들이 나오면 안되는데 편의상..
	}
}
