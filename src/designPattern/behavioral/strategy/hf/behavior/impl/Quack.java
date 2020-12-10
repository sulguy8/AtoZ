package designPattern.behavioral.strategy.hf.behavior.impl;

import designPattern.behavioral.strategy.hf.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("��");

	}

}
