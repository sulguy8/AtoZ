package designPattern.structural.decorator.ex;

public class Base implements IBeverage {
	// Component의 실질적인 인스턴스 부분이며, 책임의 주체입니다.
	@Override
	public int getTotalPrice() {
		
		return 0; // 아무것도 없는 경우에 0원이기 때문에 기본값 0 
	}

}
