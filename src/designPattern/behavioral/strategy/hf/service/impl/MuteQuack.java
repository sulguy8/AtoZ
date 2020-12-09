package designPattern.behavioral.strategy.hf.service.impl;

import designPattern.behavioral.strategy.hf.service.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Á¶¿ë ~~");

	}

}
