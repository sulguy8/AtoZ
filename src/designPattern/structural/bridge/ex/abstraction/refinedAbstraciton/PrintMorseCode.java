package designPattern.structural.bridge.ex.abstraction.refinedAbstraciton;

import designPattern.structural.bridge.ex.abstraction.MorseCode;
import designPattern.structural.bridge.ex.abstraction.implementor.MorseCodeFunction;

public class PrintMorseCode extends MorseCode {
	
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}
	public PrintMorseCode g() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode a() {
		dot();dash();space();
		return this;
	}
	public PrintMorseCode r() {
		dot();dash();dot();space();
		return this;
	}
	public PrintMorseCode m() {
		dash();dash();space();
		return this;
	}
}