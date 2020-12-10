package designPattern.structural.decorator.hf.condiment.impl;

import designPattern.structural.decorator.hf.condiment.CondimentDecorator;
import designPattern.structural.decorator.hf.drinks.Beverage;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
