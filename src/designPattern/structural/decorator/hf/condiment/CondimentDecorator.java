package designPattern.structural.decorator.hf.condiment;

import designPattern.structural.decorator.hf.drinks.Beverage;

public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();
	
	public abstract double cost();

}
