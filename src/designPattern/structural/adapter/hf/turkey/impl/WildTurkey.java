package designPattern.structural.adapter.hf.turkey.impl;

import designPattern.structural.adapter.hf.turkey.Turkey;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");

		
	}
	
	
}
