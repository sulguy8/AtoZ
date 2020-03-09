package designPattern.creational.builder.ex1;

public class Main {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();	// 구현체 호출
		factory.setBluePrint(new LgGramBluePrint());		// 구현체에 여러 인스턴스중 내가 구현하고 싶은 인스턴스 생성
		factory.make();										// 구현체에서 정의한 템플릿메소드를 실행
		Computer computer = factory.getComputer();			// 구현체에서 구조를 정의하는 메소드를 호출한다.  

		System.out.println(computer.toString());			// 구조체의 toString 메소드 호출
	}
}
