package designPattern.behavioral.template_method.ex;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
// 만약에 기능이 추가되어야 할때는 여기있는 메소드에 기능을 추가하면 된다.
	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// 서버에서 유저이름 유저의 나이를 알 수 있다.
		// 나이를 확인하고 시간을 확인하고 성인이 아니면 10시 이후에 로그아웃.
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계");
		return info;
	}
	
}
