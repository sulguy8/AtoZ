package designPattern.behavioral.strategy.hf.behavior.impl;

import designPattern.behavioral.strategy.hf.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("���� �� ���ƿ�");

	}

}
