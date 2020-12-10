package designPattern.structural.decorator.hf.drinks.impl;

import designPattern.structural.decorator.hf.drinks.Beverage;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "하우스 블렌드 커피";
	}
	@Override
	public double cost() {
		return .50;
	}

}
