package designPattern.structural.decorator.ex.decorator.concreteDecorator;

import designPattern.structural.decorator.ex.IBeverage;
import designPattern.structural.decorator.ex.decorator.AbstAdding;

public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;
	
	public Espresso(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}
	
	private static int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;
		if(espressoCount > 1) {
			addPrice = 70;
		}
		
		return addPrice;
	}
}
