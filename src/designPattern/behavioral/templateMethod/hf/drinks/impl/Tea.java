package designPattern.behavioral.templateMethod.hf.drinks.impl;

import designPattern.behavioral.templateMethod.hf.drinks.CaffeinBeverage;

public class Tea extends CaffeinBeverage{
	public void brew() {
		System.out.println("차를 우려내는 중");
		
	}
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중");
		
	}
}
