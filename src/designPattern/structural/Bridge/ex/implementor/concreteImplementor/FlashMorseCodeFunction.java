package designPattern.structural.Bridge.ex.implementor.concreteImplementor;

import designPattern.structural.Bridge.ex.implementor.MorseCodeFunction;

public class FlashMorseCodeFunction implements MorseCodeFunction {
	
	@Override
	public void dot() {
		System.out.print("#");
		
	}

	@Override
	public void dash() {
		System.out.print("-*-");
		
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}
}
