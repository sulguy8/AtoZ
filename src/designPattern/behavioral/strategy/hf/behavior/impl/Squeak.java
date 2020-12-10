package designPattern.behavioral.strategy.hf.behavior.impl;

import designPattern.behavioral.strategy.hf.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("��");

	}

}
