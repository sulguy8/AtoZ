package designPattern.structural.adapter.hf.duck.impl;

import designPattern.structural.adapter.hf.duck.Duck;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
