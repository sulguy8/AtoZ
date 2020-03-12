package designPattern.structural.bridge.ex.abstraction.implementor.concreteImplementor;

import designPattern.structural.bridge.ex.abstraction.implementor.MorseCodeFunction;

public class DefaultMorseCodeFunction implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print(".");
		
	}

	@Override
	public void dash() {
		System.out.print("-");
		
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}

}