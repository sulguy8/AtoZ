package designPattern.structural.composite;

abstract public class Component { // 설계면에서 interface대신에 abstract class를 사용한 이유? 파일 이름을 정의해줘야 하기 때문에!
	
	private String name;
	
	public Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
