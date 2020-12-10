package designPattern.structural.decorator.hf;

import designPattern.structural.decorator.hf.condiment.impl.Mocha;
import designPattern.structural.decorator.hf.condiment.impl.Soy;
import designPattern.structural.decorator.hf.condiment.impl.Whip;
import designPattern.structural.decorator.hf.drinks.Beverage;
import designPattern.structural.decorator.hf.drinks.impl.HouseBlend;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		System.out.println(beverage.description + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
