package designPattern.structural.Bridge.ex.abstraction;

import designPattern.structural.Bridge.ex.implementor.MorseCodeFunction;

public abstract class MorseCode {
	
	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void dot() {
		function.dot(); // delegate 위임한다.
		
	}
	
	public void dash() {
		function.dash();
		

	}
	public void space() {
		function.space();
		
	}
	
}
