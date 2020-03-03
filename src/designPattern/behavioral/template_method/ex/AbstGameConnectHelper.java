package designPattern.behavioral.template_method.ex;

public abstract class AbstGameConnectHelper {
	// 추상클래스로 알고리즘의 단계를 구현
	protected abstract String doSecurity(String string); // private를 사용하지 않은 이유는 하위 클래스에서 재정의 해줘야 하기 때문에.
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	// 이것이 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "123";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = "userName";
		int i = authorization(userName);
		
		switch (i) {
		case -1 :
			throw new Error("셧다운");		
		case 0 : // 게임 매니저
			System.out.println("게임 매니저");
			break ;
		case 1 : // 유료 회원
			break ;
		case 2 : // 무료 회원
			break ;
		case 3 : // 권한 없음
			break ;
			default : // 기타 상황
				break;
		}
		
		return connection(decodedInfo);
	}
}
