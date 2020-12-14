package designPattern.structural.adapter.hf.duck.impl.adapter;

import designPattern.structural.adapter.hf.duck.Duck;
import designPattern.structural.adapter.hf.turkey.Turkey;

public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
