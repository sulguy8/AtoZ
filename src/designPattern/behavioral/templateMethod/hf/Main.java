package designPattern.behavioral.templateMethod.hf;

import designPattern.behavioral.templateMethod.hf.drinks.impl.Coffee;
import designPattern.behavioral.templateMethod.hf.drinks.impl.Tea;

public class Main {
	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}
}
