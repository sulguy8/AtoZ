package designPattern.structural.decorator.ex.decorator;

import designPattern.structural.decorator.ex.IBeverage;

public abstract class AbstAdding implements IBeverage{
	
	// 컴포넌트와 장식을 동일시 해주는 역할. 
	// 밖에서 봤을때는 IBeverage로 착각될 수 있는 모양
	
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase() {
		return base;
	}
}
