package designPattern.structural.decorator.hf.condiment.impl;

import designPattern.structural.decorator.hf.condiment.CondimentDecorator;
import designPattern.structural.decorator.hf.drinks.Beverage;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return .30 + beverage.cost();
	}
}
