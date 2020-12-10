package designPattern.structural.decorator.hf.condiment.impl;

import designPattern.structural.decorator.hf.condiment.CondimentDecorator;
import designPattern.structural.decorator.hf.drinks.Beverage;

public class SteamMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 스팀밀크";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
