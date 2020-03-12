package designPattern.structural.decorator.ex.decorator.concreteDecorator;

import designPattern.structural.decorator.ex.IBeverage;
import designPattern.structural.decorator.ex.decorator.AbstAdding;

public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}

}
